package com.icyfLambdaLearn.changYongJieKou.function;

import java.util.function.Function;

/**
 * @Author: ESy
 * @Date: 2020/6/2 18:04
 *
 * T - 函数输入的类型
 * R - 函数的结果类型
 *
 * default <V> Function<T,V> andThen(Function<? super R,? extends V> after)
 * 返回一个组合函数，首先将该函数应用于其输入，然后将 after函数应用于结果。
 *
 * R apply(T t)
 * 将此函数应用于给定的参数。
 *
 */
public class FunctionDemo {
    public static void main(String[] args) {


        convert("100",Integer::parseInt);
        convert("00",Integer::parseInt);

        convert(100, i -> String.valueOf(i+666));
        convert(100, String::valueOf);

        convert("100",
                Integer::parseInt,
                i -> String.valueOf(i+666));




    }

    private static void convert(String s, Function<String,Integer> fun){
        int i = fun.apply(s);
        System.out.println(i);
    }

    private static void convert(int num, Function<Integer,String> fun){
        String str = fun.apply(num);
        System.out.println(str);
    }

    private static void convert(String s, Function<String,Integer> fun1,Function<Integer,String> fun2){
        String apply = fun1.andThen(fun2).apply(s);
        System.out.println(apply);
    }
}
