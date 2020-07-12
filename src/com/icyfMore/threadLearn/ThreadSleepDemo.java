package com.icyfMore.threadLearn;

/**
 * @Author: ESy
 * @Date: 2020/5/31 22:52
 */
public class ThreadSleepDemo {
    public static void main(String[] args) {
        ThreadSleep mt01 = new ThreadSleep("mt01艾伦·耶格尔");
        ThreadSleep mt02 = new ThreadSleep("mt02Mikasa");
        ThreadSleep mt03 = new ThreadSleep("mt03阿尔敏");






        //启动线程
        mt01.start();
        mt02.start();
        mt03.start();
    }
}
