package com.icyfReflect.Demo01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: ESy
 * @Date: 2020/6/3 14:49
 * 反射获取成员变量
 *
 * Field getField(String name)
 * 返回一个 Field对象，它反映此表示的类或接口的指定公共成员字段 类对象。
 * Field[] getFields()
 * 返回包含一个数组 Field对象反射由此表示的类或接口的所有可访问的公共字段 类对象。
 *
 * Field getDeclaredField(String name)
 * 返回一个 Field对象，它反映此表示的类或接口的指定已声明字段 类对象。
 * Field[] getDeclaredFields()
 * 返回的数组 Field对象反映此表示的类或接口声明的所有字段 类对象。
 */
public class ReflectDemo05 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("com.icyfReflect.Demo01.Student");

        //获取公共的成员变量组
        Field[] fields = c.getFields();
        for (Field f : fields){
            System.out.println(f); //public java.lang.String com.icyfReflect.Demo01.Student.address
        }
        System.out.println("---------------------------");

        //获取所有的成员变量组
        Field[] df = c.getDeclaredFields();
        for (Field f : df){
            System.out.println(f);
        }
        //private java.lang.String com.icyfReflect.Demo01.Student.name
        //int com.icyfReflect.Demo01.Student.age
        //public java.lang.String com.icyfReflect.Demo01.Student.address
        System.out.println("---------------------------");

        //获取单个公共的成员变量 Field getField(String name)
        Field addressField = c.getField("address");

        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        //void set(Object obj, Object value)
        //将指定对象参数上的此 Field对象表示的字段设置为指定的新值。
        addressField.set(obj,"哈哈");

        System.out.println(obj); //Student{name='null', age=0, address='哈哈'}



    }
}
