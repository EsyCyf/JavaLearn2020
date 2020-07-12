package com.icyfMore.serializeLearn;

import java.io.Serializable;

/**
 * @Author: ESy
 * @Date: 2020/5/30 14:47
 *
 * 类的序列化由实现java.io.Serializable接口的类启用。
 * 不实现此接口的类将不会使任何状态序列化或反序列化。
 * 可序列化类的所有子类型都是可序列化的。
 * 序列化接口没有方法或字段，仅用于标识可串行化的语义。
 *
 *
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 42L;
    private String name;
    private transient int age; //transient 不参与序列化

    public Student() {
    }

    public Student(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
