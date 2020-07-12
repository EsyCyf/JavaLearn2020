package com.icyfMore.threadSafe.LockLearn;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: ESy
 * @Date: 2020/6/1 15:39
 *
 * public interface Lock
 * Lock实现提供比使用synchronized方法和语句可以获得的更广泛的锁定操作。
 *
 * void lock()
 * 获得锁。
 * void unlock()
 * 释放锁。
 *
 * 实例化类
 * public class ReentrantLock
 * extends Object
 * implements Lock, Serializable
 *
 * ReentrantLock()
 * 创建一个 ReentrantLock的实例。
 */
public class SellTicket implements Runnable {
    private int ticket = 100;
    private Lock lock = new ReentrantLock();


    @Override
    public void run() {
        while (true){
            //同步代码块，锁
//            synchronized (lock) {

            try {
                lock.lock();
                if (ticket >= 1) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "正在出售第" + (101 - ticket) + "张票");
                    ticket--;
                } else {
                    System.out.println(Thread.currentThread().getName() + "票已售空！");
                    break;
                }
            } finally {
                lock.unlock();
            }


        }


    }
}
