package com.icyf.singletonLearn;

/**
 * @Author: ESy
 * @Date: 2020/5/24 21:17
 * 饿汉模式
 * 线程安全，比较常用，但容易产生垃圾，因为一开始就初始化
 */
public class EhanSingleton {
    private static final EhanSingleton instance = new EhanSingleton();
    private EhanSingleton(){}
    public static EhanSingleton getInstance(){
        return instance;
    }

    public void show(){
        System.out.println("这是EhanSingleton类");
    }
}
