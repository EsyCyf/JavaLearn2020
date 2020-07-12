package com.icyfLambdaLearn.changYongJieKou.consumer;

import java.util.function.Consumer;

/**
 * @Author: ESy
 * @Date: 2020/6/2 16:16
 *
 * void accept(T t)
 * 对给定的参数执行此操作。
 * default Consumer<T> andThen(Consumer<? super T> after)
 * 返回一个组合的 Consumer ，按顺序执行该操作，然后执行 after操作。
 *
 */
public class ConsumerDemo {
    public static void main(String[] args) {

        operatorString("哈哈",System.out::println); //哈哈

        operatorString("123456",
                s -> System.out.println(new StringBuilder(s).reverse().toString())); //654321


        operatorString("多次消费",System.out::println,s -> System.out.println(new StringBuilder(s).reverse().toString()));
        //多次消费
        //费消次多


    }


    private static void operatorString(String name, Consumer<String> c){
        c.accept(name);
    }

    private static void operatorString(String name, Consumer<String> c1,Consumer<String> c2){
//        c1.accept(name);
//        c2.accept(name);
        c1.andThen(c2).accept(name);
    }

}
