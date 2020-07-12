package com.icyf.javaLearnClass;

/**
 * @Author: ESy
 * @Date: 2020/5/24 21:00
 */
public class ClassStaticCount {
    public ClassStaticCount(){
        count++;
    }

    private static int count = 0;

    public static void show(){
        System.out.println("ClassStaticCount被调用了"+count+"次");
    }
}
