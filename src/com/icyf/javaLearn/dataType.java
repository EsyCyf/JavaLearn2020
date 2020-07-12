package com.icyf.javaLearn;

/**
 * @Author: ESy
 * @Date: 2020/5/23 15:08
 */
public class dataType {
    public static void main(String[] args) {


        //整数类型byte、int、short、long
        byte b = 127;
        int i = 1;
        short s = 1;
        long l = 1L; //long类型副职时需要在数字后加上l,大小写都可（小写l，idea会提示容易和1混淆）

        //浮点类型double、float
        double d = 1.22;
        float f = 1.22f; //Float赋值数字需要加上f，大小写都可

        //字符类型char
        char c1 = 'a'; //a
        char c2 = '@'; //@
        char c3 = '1'; //1
        char c4 = '\n'; //(换行)
        char c5 = '\''; //'
        char c6 = 97; //a

        //布尔类型boolean
        boolean b1 = true;
        boolean b2 = false;


        System.out.println("c1:" + c1);
        System.out.println("c2:" + c2);
        System.out.println("c3:" + c3);
        System.out.println("c4:" + c4);
        System.out.println("c5:" + c5);
        System.out.println("c6:" + c6);
    }
}
