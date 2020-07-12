package com.icyfStream;

import java.util.ArrayList;

/**
 * @Author: ESy
 * @Date: 2020/6/2 18:48
 *
 * Stream<T> skip(long n)
 * 在丢弃流的第一个 n元素后，返回由该流的 n元素组成的流。
 *
 * Stream<T> limit(long maxSize)
 * 返回由此流的元素组成的流，截短长度不能超过 maxSize 。
 */
public class StreamDemo02LimitSkip {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("哈哈哈哈");
        list.add("嘻嘻嘻嘻");
        list.add("哈哈哈");
        list.add("呼呼呼呼");
        list.add("哈哈");
        list.add("哈");

        //取前3个数据在控制台输出
        list.stream().limit(3).forEach(System.out::println);
        System.out.println("----------------------");

        //跳过3个元素，输出剩下的元素
        list.stream().skip(3).forEach(System.out::println);
        System.out.println("----------------------");

        //跳过2个元素，把剩下的前2个元素输出
        list.stream().skip(2).limit(2).forEach(System.out::println);


    }
}
