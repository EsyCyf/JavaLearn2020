package com.icyf.javaLearn;

/**
 * @Author: ESy
 * @Date: 2020/5/25 15:37
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        //创建对象
        StringBuilder sb = new StringBuilder("Esy1997");

        System.out.println(sb); //Esy1997

        //添加数据并返回本身，链式编程
        sb.append("11").append("03");

        System.out.println(sb); //Esy19971103

        //反转
        sb.reverse();
        System.out.println(sb); //30117991ysE

    }
}
