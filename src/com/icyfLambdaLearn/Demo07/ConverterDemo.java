package com.icyfLambdaLearn.Demo07;

/**
 * @Author: ESy
 * @Date: 2020/6/2 14:31
 * 引用类方法  类名::静态方法
 */
public class ConverterDemo {
    public static void main(String[] args) {

        //
        useConverter(Integer::parseInt);

    }

    private static void useConverter(Converter c){
        int num = c.converter("666");
        System.out.println(num);
    }
}
