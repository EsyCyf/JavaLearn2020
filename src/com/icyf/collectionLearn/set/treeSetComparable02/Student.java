package com.icyf.collectionLearn.set.treeSetComparable02;

/**
 * @Author: ESy
 * @Date: 2020/5/27 18:08
 */
public class Student {
    public Student() {
    }

    public Student(String name, int age) {
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
