package com.icyfMore.diGuiRecursion;

/**
 * @Author: ESy
 * @Date: 2020/5/28 16:29
 * 用递归求5的阶乘
 */
public class RecursionDemo02 {
    public static void main(String[] args) {
        System.out.println(f(5)); //120
    }

    public static int f(int n){
        if (n==1){
            return 1;
        }
        return n*f(n-1);
    }
}
