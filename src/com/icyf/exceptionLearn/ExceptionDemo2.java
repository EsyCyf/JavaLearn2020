package com.icyf.exceptionLearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @Author: ESy
 * @Date: 2020/5/26 21:47
 * throw处理只是跑出异常，并没有实际处理，程序报错并不能继续往下执行
 */
public class ExceptionDemo2 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");

        //使用throw处理编译时异常，调用方法还需要抛出异常
        try {
            method2();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }



    //运行时异常
    public static void method() throws ArrayIndexOutOfBoundsException{
        //try中捕获的异常应该能与catch中的异常类型匹配，否则程序会和往常一样中断
        int arr[] = {1,2};
        System.out.println(arr[2]);

    }


    //编译时异常
    public static void method2() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd HH:mm:ss");
        sdf.parse("2020年5月26 20:20:01");

    }
}
