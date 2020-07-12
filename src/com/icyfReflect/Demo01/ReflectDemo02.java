package com.icyfReflect.Demo01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: ESy
 * @Date: 2020/6/3 13:31
 *
 * 反射获取构造方法并使用
 *
 * Constructor<T> getConstructor(类<?>... parameterTypes)
 * 返回一个 Constructor对象，该对象反映 Constructor对象表示的类的指定的公共 类函数。
 * Constructor<?>[] getConstructors()
 * 返回包含一个数组 Constructor对象反射由此表示的类的所有公共构造 类对象。
 *
 * Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
 * 返回一个 Constructor对象，该对象反映 Constructor对象表示的类或接口的指定 类函数。
 * Constructor<?>[] getDeclaredConstructors()
 * 返回一个反映 Constructor对象表示的类声明的所有 Constructor对象的数组 类 。
 *
 */
public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c1 = Class.forName("com.icyfReflect.Demo01.Student");

        //Constructor<T> getConstructor(类<?>... parameterTypes)
        Constructor<?> constructor = c1.getConstructor();
        System.out.println(constructor); //public com.icyfReflect.Demo01.Student()
        //反射创建对象
        //T newInstance(Object... initargs)
        //使用此 Constructor对象表示的构造函数，使用指定的初始化参数来创建和初始化构造函数的声明类的新实例。
        Object o = constructor.newInstance();
        System.out.println(o); //Student{name='null', age=0, address='null'}

        System.out.println("--------------------------------");

        //Constructor<?>[] getConstructors()
        Constructor<?>[] constructors = c1.getConstructors();
        //遍历constructors
        for (Constructor con : constructors){
            System.out.println(con);
        }
        //public com.icyfReflect.Demo01.Student(java.lang.String,int,java.lang.String)
        //public com.icyfReflect.Demo01.Student()
        //只拿到了公共的，没有私有和默认
        System.out.println("--------------------------------");


        //Constructor<?>[] getDeclaredConstructors()
        Constructor<?>[] declaredConstructors = c1.getDeclaredConstructors();
        for (Constructor con : declaredConstructors){
            System.out.println(con);
        }
        //public com.icyfReflect.Demo01.Student(java.lang.String,int,java.lang.String)
        //com.icyfReflect.Demo01.Student(java.lang.String,int)
        //private com.icyfReflect.Demo01.Student(java.lang.String)
        //public com.icyfReflect.Demo01.Student()


    }
}
