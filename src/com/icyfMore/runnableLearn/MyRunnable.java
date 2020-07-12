package com.icyfMore.runnableLearn;

/**
 * @Author: ESy
 * @Date: 2020/6/1 14:22
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0;i<=100;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
