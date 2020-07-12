package com.icyf.javaLearn;

/**
 * @Author: ESy
 * @Date: 2020/5/25 13:49
 */
public class WhileMountPra {
    public static void main(String[] args) {
        //定义折叠的次数
        int count = 0;

        //定义纸张的厚度
        double paper = 0.1;

        //定义珠穆朗玛峰的高度
        int zf = 884430;

        while (paper <= zf){
            paper *= 2;
            count++;
        }

        System.out.println("折叠了"+count+"次");
    }
}
