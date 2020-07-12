package com.icyf.collectionLearn.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author: ESy
 * @Date: 2020/5/27 15:05
 */
public class IteratorLearn {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("hello");
        c.add("world");
        c.add("java");

        //迭代器
        Iterator<String> iterator = c.iterator();

        //遍历
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
