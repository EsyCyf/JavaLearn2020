package com.icyfReflect.Demo01;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @Author: ESy
 * @Date: 2020/6/3 15:28
 * 有一个ArrayList<Integer>集合，要在这个集合中添加一个字符串数据，如何实现？
 */
public class ReflectPrac01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //创建集合
        ArrayList<Integer> array = new ArrayList<>();

        array.add(10);
        array.add(20);

        Class<? extends ArrayList> c = array.getClass();
        Method madd = c.getMethod("add", Object.class);
        madd.invoke(array,"hello");
        madd.invoke(array,"world");
        madd.invoke(array,"java");

        System.out.println(array); //[10, 20, hello, world, java]

//        Integer integer = array.get(4);
//        System.out.println(integer);

        System.out.println("  ".getClass());
    }
}
