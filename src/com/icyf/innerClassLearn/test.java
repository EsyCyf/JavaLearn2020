package com.icyf.innerClassLearn;

/**
 * @Author: ESy
 * @Date: 2020/5/26 16:44
 */
public class test {
    public static void main(String[] args) {
        NiMing n = new NiMing();
        n.method(); //匿名内部类
        n.methods(); //多次调用


        new Inter(){

            @Override
            public void show() {
                System.out.println("匿名内部类的实用方法1");
            }
        }.show();

        new Inter(){

            @Override
            public void show() {
                System.out.println("匿名内部类的实用方法2");
            }
        }.show();

        //lambda表达式
        ((Inter) () -> System.out.println("匿名内部类的实用方法3")).show();
    }
}
