package com.icyfReflect.Demo02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Author: ESy
 * @Date: 2020/6/3 15:45
 * 通过配置文件运行类中的方法
 */
public class ReflectPrac02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //加载数据
        Properties properties = new Properties();
        FileReader fr = new FileReader("src\\com\\icyfReflect\\Demo02\\class.txt");
        properties.load(fr);
        fr.close();

        //ClassName=com.icyfReflect.Demo02.Student
        //methodName=study
        String className = properties.getProperty("ClassName");
        String methodName = properties.getProperty("methodName");

        Class<?> c = Class.forName(className);
        Constructor<?> constructor = c.getConstructor();
        Object obj = constructor.newInstance();

        Method m = c.getMethod(methodName); //study
        m.invoke(obj); //好好学习


    }
}
