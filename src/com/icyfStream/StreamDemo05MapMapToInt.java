package com.icyfStream;

import java.util.ArrayList;

/**
 * @Author: ESy
 * @Date: 2020/6/2 20:27
 *
 * <R> Stream<R> map(Function<? super T,? extends R> mapper)
 * 返回由给定函数应用于此流的元素的结果组成的流。
 *
 * IntStream mapToInt(ToIntFunction<? super T> mapper)
 * 返回一个 IntStream ，其中包含将给定函数应用于此流的元素的结果。
 *
 */
public class StreamDemo05MapMapToInt {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("11");
        list.add("222");
        list.add("333");
        list.add("44");
        list.add("55");
        list.add("66");


        //将集合中的字符串转为整数后再输出
//        list.stream().map(Integer::parseInt).forEach(System.out::println);
        //返回一个 IntStream
        //IntStream中有
        //int sum()
        //返回此流中元素的总和。(终结操作
        int result = list.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(result); //731


    }
}
