package com.icyfMore.serializeLearn;

import java.io.*;

/**
 * @Author: ESy
 * @Date: 2020/5/30 15:02
 *
 *1、用序列化流一个对象后，如果再去修改该对象的类（比如重写了toString），读取数据会不会出问题？
 *  java.io.InvalidClassException:
 *   com.icyfMore.serializeLearn.Student;
 *  local class incompatible:
 *   stream classdesc serialVersionUID = -7743589428072098077,
 *   local class serialVersionUID = 14760204076708309
 *
 *  public class InvalidClassException extends ObjectStreamException
 *  当序列化运行时检测到类中的以下问题之一时抛出。
 *   类的串行版本与从流中读取的类描述符的类型不匹配
 *   该类包含未知的数据类型
 *   该类没有可访问的无参数构造函数
 *
 *   总结：序列化id变了（详见Serializable帮助文档
 *
 * 2、如果出问题了，如何解决？
 *  强烈建议所有可序列化的类都明确（显式）声明serialVersionUID值
 *  给对象所属的类加一个值 private static final long serialVersionUID = 42L;
 *
 * 3、如果一个对象中的某个成员变量的值不想被序列化，又该如何实现？
 *  加上修饰符 transient
 *  如：private transient int age; (默认值0）
 *
 */
public class ObectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        write("ser\\oos.txt");
        read("ser\\oos.txt");


    }





    public static void write(String path) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));

        Student s = new Student("哈哈",11);

        oos.writeObject(s);


        oos.close();
    }
    public static void read(String path) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));

        Object object = ois.readObject();
        Student s = (Student)object;

        System.out.println(s.getName()+" "+s.getAge());

        ois.close();
    }
}
