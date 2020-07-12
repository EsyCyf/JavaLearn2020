package com.icyf.collectionLearn.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: ESy
 * @Date: 2020/5/27 16:04
 */
public class threeWayToPrint {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("world");
        list.add("java");

        //迭代器遍历
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("============");

        //for循环索引
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("============");

        //增强for循环
        for (String s:list){
            System.out.println(s);
        }

    }
}
