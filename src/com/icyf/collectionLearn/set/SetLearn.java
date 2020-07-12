package com.icyf.collectionLearn.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: ESy
 * @Date: 2020/5/27 16:32
 * Set集合特点：
 *  不包含重复元素的集合
 *  没有带索引的方法，所以不能使用普通的for循环遍历
 *
 * HashSet：对集合的迭代顺序不做任何保证
 *
 */
public class SetLearn {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        //添加元素
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("world"); //不包含重复元素

        System.out.println(set); //[world, java, hello]
        for (String s:set){
            System.out.println(s);
            //world
            //java
            //hello
        }



    }
}
