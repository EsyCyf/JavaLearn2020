package com.icyfReflect.Demo01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: ESy
 * @Date: 2020/6/3 15:19
 *
 * 反射获取成员方法并使用练习
 */
public class ReflectDemo08 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("com.icyfReflect.Demo01.Student");
        Constructor<?> constructor = c.getConstructor();
        Object obj = constructor.newInstance();

        //private void function(){
        //        System.out.println("private function");
        //    }
        //    public void method1(){
        //        System.out.println("public method1");
        //    }
        //    public void method2(String s){
        //        System.out.println("public method2"+s);
        //    }
        //    public String method3(String s,int i){
        //        return s+","+i;
        //    }

        Method f1 = c.getDeclaredMethod("function");
        f1.setAccessible(true);
        f1.invoke(obj); //private function
        System.out.println("----------------------------");

        Method m1 = c.getMethod("method1");
        m1.invoke(obj); //public method1
        System.out.println("----------------------------");

        Method m2 = c.getMethod("method2",String.class);
        m2.invoke(obj,"JAJAJA"); //public method2JAJAJA
        System.out.println("----------------------------");

        Method m3 = c.getMethod("method3",String.class,int.class);
        Object m3invoke = m3.invoke(obj, "????", 111111);
        System.out.println(m3invoke); //????,111111
    }
}
