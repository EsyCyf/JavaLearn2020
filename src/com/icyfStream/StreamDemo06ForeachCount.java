package com.icyfStream;

import java.util.ArrayList;

/**
 * @Author: ESy
 * @Date: 2020/6/2 20:35
 *
 * 常用终结操作
 *
 *
 * void forEach(Consumer<? super T> action)
 * 对此流的每个元素执行操作。
 *
 * long count()
 * 返回此流中的元素数。
 */
public class StreamDemo06ForeachCount {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("11");
        list.add("222");
        list.add("333");
        list.add("44");
        list.add("55");
        list.add("66");

        //遍历输出
//        list.stream().forEach(System.out::println);

        //统计
        long count = list.stream().filter(s -> s.length() == 2).count();
        System.out.println(count); //4
    }
}
