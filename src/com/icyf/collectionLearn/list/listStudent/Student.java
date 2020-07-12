package com.icyf.collectionLearn.list.listStudent;

/**
 * @Author: ESy
 * @Date: 2020/5/27 15:25
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {

        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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


}