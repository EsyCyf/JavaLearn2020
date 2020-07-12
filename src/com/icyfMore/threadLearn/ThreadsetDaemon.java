package com.icyfMore.threadLearn;

/**
 * @Author: ESy
 * @Date: 2020/6/1 0:02
 */
public class ThreadsetDaemon extends Thread {
    public ThreadsetDaemon(String s) {
        super(s);
    }

    public ThreadsetDaemon() {

    }

    @Override
    public void run() {
        for (int i = 0;i<=100;i++) {
            System.out.println(getName() + ":" + i);
        }

    }

}
