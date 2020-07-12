package com.icyfMore.threadLearn;

/**
 * @Author: ESy
 * @Date: 2020/5/30 22:23
 *
 * public class Thread
 * extends Object
 * implements Runnable
 *
 * 创建一个新的执行线程有两种方法。
 * 方法一：
 * 将一个类声明为Thread的子类。
 * 这个子类应该重写Thread类的方法run 。
 * 然后可以分配并启动子类的实例。
 */
public class MyThread01 extends Thread{
    //无法重写属性name的get和set方法，因为Thread中getName()和setName()是final
//    private String name;
//
//    @Override
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public void setName(String name) {
//        this.name = name;
//    }

    public MyThread01() {
    }

    public MyThread01(String s) {
        super(s);
    }

    @Override
    public void run() {
        for (int i = 0;i<=100;i++){
            System.out.println(getName()+":"+i);
        }
    }
}
