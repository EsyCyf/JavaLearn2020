package com.icyfMore.threadLearn;

/**
 * @Author: ESy
 * @Date: 2020/5/31 22:42
 *
 *
 */
public class MyThreadDemo02 {
    public static void main(String[] args) throws InterruptedException {
        MyThread01 mt01 = new MyThread01();
        MyThread01 mt02 = new MyThread01("mt02Mikasa");
        MyThread01 mt03 = new MyThread01("mt03阿尔敏");
        MyThread01 mt04 = new MyThread01("mt04莱纳，你坐啊");


        Thread t1 = new Thread(mt01,"呵呵呵");
        t1.start();







        //启动线程
        mt01.start();
//        mt02.start();
//        mt03.start();
//        mt04.start();
    }

}
