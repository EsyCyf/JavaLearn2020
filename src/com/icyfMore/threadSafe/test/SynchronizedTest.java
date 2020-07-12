package com.icyfMore.threadSafe.test;

/**
 * @Author: ESy
 * @Date: 2020/6/17 16:52
 */
public class SynchronizedTest implements Runnable {
    private Integer x = 0;
    final Object object = new Object();

    public static void main(String[] args) {
        SynchronizedTest s1 = new SynchronizedTest();
        Thread t1 = new Thread(s1, "t1");
        Thread t2 = new Thread(s1, "t2");
        Thread t3 = new Thread(s1, "t3");
        t1.start();
        t2.start();
        t3.start();
    }


    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 30; i++) {

                x++;
                System.out.println(Thread.currentThread().getName() + "----" + x);
            }
        }


    }
}
