package com.icyfStream;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @Author: ESy
 * @Date: 2020/6/2 20:20
 *
 * Stream<T> sorted()
 * 返回由此流的元素组成的流，根据自然顺序排序。
 *
 * Stream<T> sorted(Comparator<? super T> comparator)
 * 返回由该流的元素组成的流，根据提供的 Comparator进行排序。
 *
 */
public class StreamDemo04Sorted {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("aa");
        list.add("bbbbb");
        list.add("ccccccccc");
        list.add("dddd");
        list.add("eeeeee");
        list.add("fffff");

        //按照字母顺序 在控制台输出
//        list.stream().sorted().forEach(System.out::println);

        //按照字符串长度
        list.stream().sorted((s1,s2)->{
            int num = s1.length() - s2.length();
            int num2 = num==0?s1.compareTo(s2):num;
            return num2;
        }).forEach(System.out::println);
    }
}
