package com.icyfReflect.Demo01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: ESy
 * @Date: 2020/6/3 14:35
 * 反射获取构造器练习
 * Student student = new Student(name,age,address);
 *
 */
public class ReflectDemo03 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("com.icyfReflect.Demo01.Student");
        //基本数据类型也可以通过.class获得对应的Class类型
        Constructor<?> constructor = c.getConstructor(String.class, int.class, String.class);
        Object obj = constructor.newInstance("哈哈", 10, "呵呵");
        System.out.println(obj); //Student{name='哈哈', age=10, address='呵呵'}

    }
}
