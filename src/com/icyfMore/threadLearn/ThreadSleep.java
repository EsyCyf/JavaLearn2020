package com.icyfMore.threadLearn;

/**
 * @Author: ESy
 * @Date: 2020/5/31 22:52
 * static void sleep(long millis)
 * 使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行），具体取决于系统定时器和调度程序的精度和准确性。
 * static void sleep(long millis, int nanos)
 * 导致正在执行的线程以指定的毫秒数加上指定的纳秒数来暂停（临时停止执行），这取决于系统定时器和调度器的精度和准确性。
 */
public class ThreadSleep extends Thread{
    public ThreadSleep() {
    }

    public ThreadSleep(String s) {
        super(s);
    }

    @Override
    public void run() {
        for (int i = 0;i<=100;i++){
            System.out.println(getName()+":"+i);
            try {
                sleep(1000); //休息1000毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
