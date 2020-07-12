package com.icyfMore.runnableLearn;

/**
 * @Author: ESy
 * @Date: 2020/6/1 14:22
 *
 * Thread(Runnable target)
 * 分配一个新的 Thread对象。
 * Thread(Runnable target, String name)
 * 分配一个新的 Thread对象。
 *
 *
 */
public class MyRunnableDemo {
    public static void main(String[] args) {
        MyRunnable my = new MyRunnable();

        Thread t1 = new Thread(my);
        t1.setName("t1艾伦·耶格尔");
        Thread t2 = new Thread(my,"t2Mikasa");


        //启动线程
        t1.start();
        t2.start();
    }
}
