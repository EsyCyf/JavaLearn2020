package com.icyfReflect.Demo01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: ESy
 * @Date: 2020/6/3 14:40
 * 反射获取构造器练习
 * 获取并使用私有构造方法
 * 暴力反射
 */
public class ReflectDemo04 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("com.icyfReflect.Demo01.Student");
        Constructor<?> dcon = c.getDeclaredConstructor(String.class);

        //Class com.icyfReflect.Demo01.ReflectDemo04 can not access a member of class com.icyfReflect.Demo01.Student with modifiers "private"
        //无法使用私有的构造方法创建对象
//        Object obj = dcon.newInstance("哈哈哈哈");

        //暴力反射
        //void setAccessible(boolean flag)
        //将此对象的accessible标志设置为指示的布尔值。
        //true的值表示反射对象应该在使用时抑制Java语言访问检查。
        //false的值表示反映的对象应该强制执行Java语言访问检查。
        dcon.setAccessible(true);

        Object obj = dcon.newInstance("哈哈哈哈");
        System.out.println(obj); //Student{name='哈哈哈哈', age=0, address='null'}
    }
}
