package com.icyfStream;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @Author: ESy
 * @Date: 2020/6/2 20:14
 *
 * static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
 * 创建一个懒惰连接的流，其元素是第一个流的所有元素，后跟第二个流的所有元素。
 *
 * Stream<T> distinct()
 * 返回由该流的不同元素（根据 Object.equals(Object) ）组成的流。
 */
public class StreamDemo03ConcatDistinct {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("哈哈哈哈");
        list.add("嘻嘻嘻嘻");
        list.add("哈哈哈");
        list.add("呼呼呼呼");
        list.add("哈哈");
        list.add("哈");


        //取前四个数据组成一个流
        Stream<String> s1 = list.stream().limit(4);
//        s1.forEach(System.out::println);
        System.out.println("----------------------");

        //跳过两个数据组成一个流
        Stream<String> s2 = list.stream().skip(2);
//        s2.forEach(System.out::println);
        System.out.println("----------------------");

        //合并s1和s2流
//        Stream.concat(s1,s2).forEach(System.out::println);
        System.out.println("----------------------");

        //合并s1和s2流，要求合并的流中字符串不能重复
        Stream.concat(s1,s2).distinct().forEach(System.out::println);


    }
}
