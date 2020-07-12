package com.icyfReflect.Demo01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: ESy
 * @Date: 2020/6/3 15:00
 * 反射获取成员变量练习
 * 暴力反射
 */
public class ReflectDemo06 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("com.icyfReflect.Demo01.Student");
        //获取构造器 并创建对象
        Constructor<?> constructor = c.getConstructor();
        Object obj = constructor.newInstance();
        //获取成员变量
        Field nameField = c.getDeclaredField("name");
        Field ageField = c.getDeclaredField("age");
        Field addressField = c.getDeclaredField("address");
        //暴力反射 并 赋值
        nameField.setAccessible(true);
        nameField.set(obj,"哈哈");
        ageField.setAccessible(true);
        ageField.set(obj,100);
        addressField.setAccessible(true);
        addressField.set(obj,"嘻嘻");


        System.out.println(obj); //Student{name='哈哈', age=100, address='嘻嘻'}

    }
}
