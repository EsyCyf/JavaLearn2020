package com.icyfMore.threadLearn;

/**
 * @Author: ESy
 * @Date: 2020/5/31 23:57
 */
public class ThreadJoin extends Thread{
    public ThreadJoin(String s) {
        super(s);
    }

    public ThreadJoin() {

    }

    @Override
    public void run() {
        for (int i = 0;i<=100;i++) {
            System.out.println(getName() + ":" + i);
        }

    }
}
