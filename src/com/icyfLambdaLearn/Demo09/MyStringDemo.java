package com.icyfLambdaLearn.Demo09;

/**
 * @Author: ESy
 * @Date: 2020/6/2 14:56
 * 引用类的实例方法 类名::成员方法
 */
public class MyStringDemo {
    public static void main(String[] args) {


        useMyString((s,x,y)->s.substring(x,y));

        //第一个参数作为调用者，后面的参数全部传递给该方法作为参数
        useMyString(String::substring);


    }



    private static void useMyString(MyString m){
        String s = m.mySubString("HelloWorld!", 1, 3);
        System.out.println(s);
    }
}
