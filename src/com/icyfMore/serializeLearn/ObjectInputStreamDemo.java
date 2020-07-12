package com.icyfMore.serializeLearn;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @Author: ESy
 * @Date: 2020/5/30 14:54
 *
 * 反序列化流
 *
 * ObjectInputStream(InputStream in)
 * 创建从指定的InputStream读取的ObjectInputStream。
 *
 * Object readObject()
 * 从ObjectInputStream读取一个对象。
 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ser\\oos.txt"));

        Object object = ois.readObject();
        Student s = (Student)object;

        System.out.println(s.getName()+" "+s.getAge());


        ois.close();
    }
}
