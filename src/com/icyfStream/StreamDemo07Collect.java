package com.icyfStream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: ESy
 * @Date: 2020/6/2 20:59
 *
 * <R,A> R collect(Collector<? super T,A,R> collector)
 * 使用 Collector对此流的元素执行 mutable reduction Collector 。
 *
 * public final class Collectors
 * extends Object
 *      static <T> Collector<T,?,List<T>> toList()
 *      返回一个 Collector ，它将输入元素 List到一个新的 List 。
 *
 *      static <T> Collector<T,?,Set<T>> toSet()
 *      返回一个 Collector ，将输入元素 Set到一个新的 Set 。
 *
 *      static <T,K,U> Collector<T,?,Map<K,U>> toMap(Function<? super T,? extends K> keyMapper, Function<? super T,? extends U> valueMapper)
 *      返回一个 Collector ，它将元素累加到一个 Map ，其键和值是将所提供的映射函数应用于输入元素的结果。
 *
 */
public class StreamDemo07Collect {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("哈哈哈哈");
        list.add("嘻嘻嘻嘻");
        list.add("哈哈哈");
        list.add("呼呼呼呼");
        list.add("哈哈");
        list.add("哈");

        Stream<String> listStream = list.stream().filter(s->s.length()==4);

        //把Stream流操作完毕的数据收集到List集合
        List<String> names = listStream.collect(Collectors.toList());

        for (String name:names){
            System.out.println(name);
        }
        System.out.println("=======================================");


        Set<Integer> set = new HashSet<>();
        set.add(11);
        set.add(22);
        set.add(33);
        set.add(44);
        set.add(55);
        //把Stream流操作完毕的数据收集到Set集合
        Stream<Integer> setStream = set.stream().filter(s -> s > 25);
        Set<Integer> ages = setStream.collect(Collectors.toSet());
        for (int age : ages){
            System.out.println(age);
        }
        System.out.println("=======================================");


        String[] strings = {"哈哈,11","嘻嘻,22","呵呵,33","呼呼,44","呜呜,55"};

        Stream<String> arrStream = Stream.of(strings).filter(s -> Integer.parseInt(s.split(",")[1]) > 25);

        Map<String, String> map = arrStream.collect(Collectors.toMap(s -> s.split(",")[0], s -> s.split(",")[1]));

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry:entries){
            System.out.println(entry.getKey()+","+entry.getValue());
        }


    }
}
