package com.icyfStream;

import java.util.*;
import java.util.stream.Stream;

/**
 * @Author: ESy
 * @Date: 2020/6/2 18:37
 *
 * 1.2 Stream流的生成方式
 * Stream流的常见生成方式
 * ●Collection体系的集 合可以使用默认方法stream(生成流
 * default Stream<E> stream()
 *
 * ●Map体 系的集合间接的生成流
 *
 * ●数组可以通过Stream接口的静态方法... values)生成流
 *
 */
public class HowToMakeStream {
    public static void main(String[] args) {
        //Collection体系集合
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream1 = set.stream();


        //Map体系集合 间接使用
        Map<String,Integer> map = new HashMap<>();
        Stream<String> stream2 = map.keySet().stream();
        Stream<Integer> stream3 = map.values().stream();
        Stream<Map.Entry<String, Integer>> stream4 = map.entrySet().stream();


        //数组
        String[] strArr = {"hello","world","java"};
        Stream<String> strArr1 = Stream.of(strArr);
        Stream<String> strArr2 = Stream.of("hello","world","java");
        Stream<Integer> strArr3 = Stream.of(10,20,30);
//        Stream<String> stream5 = Arrays.stream(strArr);

    }
}
