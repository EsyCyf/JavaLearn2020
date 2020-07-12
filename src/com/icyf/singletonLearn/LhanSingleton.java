package com.icyf.singletonLearn;

/**
 * @Author: ESy
 * @Date: 2020/5/24 21:19
 * 懒汉模式
 * 线程不安全，延迟初始化，严格意义上不是不是单例模式
 */
public class LhanSingleton {
    private static LhanSingleton instance ;
    private LhanSingleton(){}
    public static LhanSingleton getInstance(){
        if (instance == null) instance = new LhanSingleton();
        return instance;
    }
    public void show(){
        System.out.println("这是LhanSingleton类");
    }

}
