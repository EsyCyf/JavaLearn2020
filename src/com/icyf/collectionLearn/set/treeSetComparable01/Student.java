package com.icyf.collectionLearn.set.treeSetComparable01;

/**
 * @Author: ESy
 * @Date: 2020/5/27 17:42
 */
public class Student implements Comparable<Student>{
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

    @Override
    public int compareTo(Student  s) {
//        return 0; //不添加
//        return 1; //升序
//        return -1; //降序
        int num = this.age - s.age;
        int num2 = num==0?this.name.compareTo(s.name):num;
        return num2;
    }
}
