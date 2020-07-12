package com.icyfMore.diGuiRecursion;

/**
 * @Author: ESy
 * @Date: 2020/5/28 16:14
 */
public class RecursionDemo01 {
    public static void main(String[] args) {

        System.out.println(f(20)); //6765
    }


    //递归函数一定要有出口
    //StackOverflowError
    //当堆栈溢出发生时抛出一个应用程序递归太深。
    public static int f(int n){
        if (n==1||n==2){
            return 1; //递归出口
        }
        return f(n-1)+f(n-2);
    }
}
