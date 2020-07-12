package com.icyfLambdaLearn.Demo10;

/**
 * @Author: ESy
 * @Date: 2020/6/2 15:09
 */
public class Student {
    public Student() {
    }

    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;


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
