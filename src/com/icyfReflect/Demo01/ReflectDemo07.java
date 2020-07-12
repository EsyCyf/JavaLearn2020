package com.icyfReflect.Demo01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: ESy
 * @Date: 2020/6/3 15:07
 * 反射获取成员方法并使用
 *
 * Method getMethod(String name, 类<?>... parameterTypes)
 * 返回一个 方法对象，它反映此表示的类或接口的指定公共成员方法 类对象。
 * Method[] getMethods()
 * 返回包含一个数组 方法对象反射由此表示的类或接口的所有公共方法 类对象，包括那些由类或接口和那些从超类和超接口继承的声明。
 *
 * Method getDeclaredMethod(String name, 类<?>... parameterTypes)
 * 返回一个 方法对象，它反映此表示的类或接口的指定声明的方法 类对象。
 * Method[] getDeclaredMethods()
 * 返回包含一个数组 方法对象反射的类或接口的所有声明的方法，通过此表示 类对象，包括公共，保护，默认（包）访问和私有方法，但不包括继承的方法。
 */
public class ReflectDemo07 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("com.icyfReflect.Demo01.Student");
        Constructor<?> constructor = c.getConstructor();
        Object obj = constructor.newInstance();

        //Method[] getMethods()
        //所有公共方法 类对象，包括那些由类或接口和那些从超类和超接口继承的声明。
        Method[] methods = c.getMethods();
        for (Method m : methods){
            System.out.println(m);
        }
        //public java.lang.String com.icyfReflect.Demo01.Student.toString()
        //public void com.icyfReflect.Demo01.Student.method1()
        //public void com.icyfReflect.Demo01.Student.method2(java.lang.String)
        //public java.lang.String com.icyfReflect.Demo01.Student.method3(java.lang.String,int)
        //public final void java.lang.Object.wait() throws java.lang.InterruptedException
        //public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
        //public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException
        //public boolean java.lang.Object.equals(java.lang.Object)
        //public native int java.lang.Object.hashCode()
        //public final native java.lang.Class java.lang.Object.getClass()
        //public final native void java.lang.Object.notify()
        //public final native void java.lang.Object.notifyAll()
        System.out.println("------------------------------------");

        //Method[] getDeclaredMethods()
        //通过此表示 类对象，包括公共，保护，默认（包）访问和私有方法，但不包括继承的方法。
        Method[] declaredMethods = c.getDeclaredMethods();
        for (Method m : declaredMethods){
            System.out.println(m);
        }
        //public java.lang.String com.icyfReflect.Demo01.Student.toString()
        //private void com.icyfReflect.Demo01.Student.function()
        //public void com.icyfReflect.Demo01.Student.method1()
        //public void com.icyfReflect.Demo01.Student.method2(java.lang.String)
        //public java.lang.String com.icyfReflect.Demo01.Student.method3(java.lang.String,int)
        System.out.println("------------------------------------");



        //Method getMethod(String name, 类<?>... parameterTypes)
        //获取单个方法
        Method m1 = c.getMethod("method1");
        //public void method1(){
        //        System.out.println("public method1");
        //    }
        System.out.println(m1); //public void com.icyfReflect.Demo01.Student.method1()

        //Object invoke(Object obj, Object... args)
        //                  obj - 从底层方法被调用的对象
        //                  args - 用于方法调用的参数
        //在具有指定参数的 方法对象上调用此 方法对象表示的底层方法。
        m1.invoke(obj); //public method1
        System.out.println("------------------------------------");


    }
}
