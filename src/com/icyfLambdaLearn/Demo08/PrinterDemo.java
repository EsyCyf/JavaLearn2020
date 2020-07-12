package com.icyfLambdaLearn.Demo08;

/**
 * @Author: ESy
 * @Date: 2020/6/2 14:37
 * 引用对象的实例方法  对象::成员方法
 */
public class PrinterDemo {
    public static void main(String[] args) {


        PrintString ps = new PrintString();
        usePrinter(ps::printUpper);

        usePrinter(new PrintString()::printUpper);
//        usePrinter(String::toUpperCase); //可行，但没有返回值，也没有输出语句，故无效




    }

    private static void usePrinter(Printer p){
        p.printUpperCase("Hello World");
    }
}
