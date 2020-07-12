package com.icyf.collectionLearn.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author: ESy
 * @Date: 2020/5/27 15:50
 */
public class ListIteratorLearn {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("world");
        list.add("java");

        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=======================");
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

        /**
         * hello
         * world
         * java
         * =======================
         * java
         * world
         * hello
         */
    }
}
