package com.icyfMore.serializeLearn;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @Author: ESy
 * @Date: 2020/5/30 14:45
 *
 * 序列化流
 *
 * 可以通过使用流的文件来实现对象的持久存储。
 * 如果流是网络套接字流，则可以在另一个主机上或另一个进程中重构对象。
 *
 *protected  ObjectOutputStream()
 * 为完全重新实现ObjectOutputStream的子类提供一种方法，不必分配刚刚被ObjectOutputStream实现使用的私有数据。
 *   ObjectOutputStream(OutputStream out)
 * 创建一个写入指定的OutputStream的ObjectOutputStream。
 *
 * void writeObject(Object obj)
 * 将指定的对象写入ObjectOutputStream。
 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ser\\oos.txt"));

        Student s = new Student("哈哈",11);

        oos.writeObject(s);



        oos.close();

    }
}
