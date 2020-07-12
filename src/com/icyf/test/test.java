package com.icyf.test;

/**
 * @Author: ESy
 * @Date: 2020/6/2 15:03
 */
public class test {
    public static void main(String[] args) {
//        int i = 0;
//        System.out.println(i); //0
//        add(i);
//        System.out.println(i); //0

        StringBuilder stringBuilder = new StringBuilder("111");
        System.out.println(stringBuilder);//111
        strAdd(stringBuilder);
        System.out.println(stringBuilder);//111haha
    }

    private static void add(int i){
        i += 1;
    }
    private static void strAdd(StringBuilder s){
        s.append("haha");
    }
}
