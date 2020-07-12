package com.icyfStream;

import java.util.ArrayList;

/**
 * @Author: ESy
 * @Date: 2020/6/2 18:24
 *
 * Stream<T> filter(Predicate<? super T> predicate)
 * 返回由与此给定谓词匹配的此流的元素组成的流。
 *
 * void forEach(Consumer<? super T> action)
 * 对此流的每个元素执行操作。
 */
public class StreamDemo01Filter {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("哈哈哈哈");
        list.add("嘻嘻嘻嘻");
        list.add("哈哈哈");
        list.add("呼呼呼呼");
        list.add("哈哈");
        list.add("哈");

        ArrayList<String> halist = new ArrayList<>();
        for (String s:list){
            if (s.startsWith("哈")){
                halist.add(s);
            }
        }
        System.out.println(halist);


        ArrayList<String> threelist = new ArrayList<>();
        for (String s:list){
            if (s.length()>3){
                threelist.add(s);
            }
        }
        System.out.println(threelist);

        System.out.println("=================================");

        //Stream流改写
        //Stream<T> filter(Predicate<? super T> predicate)
        //返回由与此给定谓词匹配的此流的元素组成的流。
        //void forEach(Consumer<? super T> action)
        //对此流的每个元素执行操作。
        list.stream()
                .filter(s->s.startsWith("哈"))
                .filter(s -> s.length()==3)
                .forEach(System.out::println);


    }
}
