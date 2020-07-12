package com.icyf.exceptionLearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: ESy
 * @Date: 2020/5/26 21:26
 * 运行时异常 与 编译时异常
 */
public class ExceptionDemo1 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");


    }

    //运行时异常（非受检异常）
    public static void method(){
        //try中捕获的异常应该能与catch中的异常类型匹配，否则程序会和往常一样中断
        try {
            int arr[] = {1,2};
            System.out.println(arr[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
//            System.out.println(e.getMessage()); //2
//            System.out.println(e.toString()); //java.lang.ArrayIndexOutOfBoundsException: 2

        }
    }


    //编译时异常（受检异常），不抛出异常就无法通过编译
    public static void method2(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd HH:mm:ss");
        try {
            sdf.parse("2020年5月26 20:20:01");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
