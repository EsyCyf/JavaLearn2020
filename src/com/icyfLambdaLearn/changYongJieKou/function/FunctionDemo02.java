package com.icyfLambdaLearn.changYongJieKou.function;

import java.util.function.Function;

/**
 * @Author: ESy
 * @Date: 2020/6/2 18:16
 * ●Strings = "林青霞30";
 * ●
 * 请按照我指定的要求进行操作:
 * 1:将字符串截取得到数字年龄部分
 * 2:将上一步的年龄字符串转换成为int类型的数据
 * 3:将.上一步的int数据加70， 得到-一 个int结果， 在控制台输出
 * ●
 * 请通过Function接C来实现函数拼接
 */
public class FunctionDemo02 {
    public static void main(String[] args) {

        convert("林青霞,30",
                s -> s.split(",")[1],
                Integer::parseInt,
                i -> i+70);

    }
    private static void convert(String s, Function<String,String> fun1, Function<String,Integer> fun2, Function<Integer,Integer> fun3){
        int num = fun1.andThen(fun2).andThen(fun3).apply(s);
        System.out.println(num);
    }
}
