package com.icyfLambdaLearn.Demo11;

/**
 * @Author: ESy
 * @Date: 2020/6/2 15:21
 */
public class MyInterfaceDemo {
    public static void main(String[] args) {
        MyInterface my = ()-> System.out.println("函数式接口");
        my.show();

    }
}
