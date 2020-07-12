package com.icyfMore.threadLearn;

/**
 * @Author: ESy
 * @Date: 2020/6/1 0:02
 * <p>
 * public final void setDaemon(boolean on)
 * 将此线程标记为daemon线程或用户线程。
 * 当运行的唯一线程都是守护进程线程时，Java虚拟机将退出。
 * 线程启动前必须调用此方法。
 */
public class ThreadsetDaemonDemo {
    public static void main(String[] args) {
        ThreadsetDaemon mt01 = new ThreadsetDaemon("mt01艾伦·耶格尔");
        ThreadsetDaemon mt02 = new ThreadsetDaemon("mt02Mikasa");
        ThreadsetDaemon mt03 = new ThreadsetDaemon("mt03阿尔敏");


        //设置主线程艾伦
//        Thread.currentThread().setName("主线程:艾伦·耶格尔");
        mt01.setPriority(10);

        //设置守护线程，当其他线程结束，只剩下守护线程时，线程会快速挂掉
        mt02.setDaemon(true);
        mt03.setDaemon(true);


        //启动线程
        mt01.start();
        mt02.start();
        mt03.start();

        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }


    }
}
