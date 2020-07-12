package com.icyfMore.threadSafe.safeClass;

import java.util.*;

/**
 * @Author: ESy
 * @Date: 2020/6/1 15:27
 */
public class ThreadDemo {
    public static void main(String[] args) {

        //内部加了synchronized，线程安全
        new StringBuffer();
        new Hashtable<>(); //一般不使用
        new Vector<>(); //一般不使用


        //没有synchronized
        new StringBuilder();
        new HashMap<>();
        new ArrayList<>();


        //static <T> List<T> synchronizedList(List<T> list)
        //返回由指定列表支持的同步（线程安全）列表。
        Collections.synchronizedList(new ArrayList<>());

    }
}
