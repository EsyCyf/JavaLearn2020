package com.icyfMore.threadLearn;

/**
 * @Author: ESy
 * @Date: 2020/5/30 22:26
 *
 * void start()
 * 导致此线程开始执行; Java虚拟机调用此线程的run方法。
 *
 * void setName(String name)
 * 将此线程的名称更改为等于参数 name 。
 *
 * String getName()
 * 返回此线程的名称。
 *
 * static Thread currentThread()
 * 返回对当前正在执行的线程对象的引用。
 *
 * int getPriority()
 * 返回此线程的优先级。
 *
 * void setPriority(int newPriority)
 * 更改此线程的优先级。
 *      异常
 *      IllegalArgumentException - 如果优先级不在 MIN_PRIORITY到 MAX_PRIORITY 。
 *      SecurityException - 如果当前线程不能修改此线程。
 *
 */
public class MyThreadDemo01 {
    public static void main(String[] args) {
        MyThread01 mt01 = new MyThread01();
        MyThread01 mt02 = new MyThread01();
        MyThread01 mt03 = new MyThread01("mt03阿尔敏"); //有参构造中设置线程名称
        MyThread01 mt04 = new MyThread01("mt04莱纳，你坐啊");

        //设置线程名称
        mt01.setName("mt01艾伦·耶格尔");
        mt02.setName("mt02Mikasa");


//        System.out.println(Thread.currentThread().getName()); //main

        //.getPriority()返回线程优先级,默认是5
        System.out.println(mt01.getPriority()); //5
        //线程最高优先级
        System.out.println(Thread.MAX_PRIORITY ); //10
        //线程最低优先级
        System.out.println(Thread.MIN_PRIORITY ); //1

        //线程优先级高，仅仅表示获取的CPU时间片的几率高
        mt01.setPriority(10);
        mt02.setPriority(10);
        mt03.setPriority(1);
        mt04.setPriority(1);


        //启动线程
        mt01.start();
//        mt02.start();
//        mt03.start();
        mt04.start();


    }
}
