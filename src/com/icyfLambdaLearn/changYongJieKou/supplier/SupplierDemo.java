package com.icyfLambdaLearn.changYongJieKou.supplier;

import java.util.function.Supplier;

/**
 * @Author: ESy
 * @Date: 2020/6/2 15:58
 *
 * @FunctionalInterface
 * public interface Supplier<T>
 *
 * T get()
 * 获得结果。
 *
 */
public class SupplierDemo {
    public static void main(String[] args) {

        System.out.println(getString(() -> "哈哈哈"));

        System.out.println(getInt(() -> 30));


    }

    private static String getString(Supplier<String> s){
        return s.get();
    }

    private static int getInt(Supplier<Integer> s){
        return s.get();
    }
}
