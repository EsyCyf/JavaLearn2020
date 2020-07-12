package com.icyf.singletonLearn;

/**
 * @Author: ESy
 * @Date: 2020/5/24 21:42
 */
public class StaticSingleton {
    private static class StaticSingletonHoleder{
        private static final StaticSingleton INSTANCE = new StaticSingleton();
    }

    private StaticSingleton(){}
    public static final StaticSingleton getInstance(){
        return StaticSingletonHoleder.INSTANCE;
    }
    public void show(){
        System.out.println("这是StaticSingleton类");
    }
}
