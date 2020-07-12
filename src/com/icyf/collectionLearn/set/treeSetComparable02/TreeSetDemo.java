package com.icyf.collectionLearn.set.treeSetComparable02;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author: ESy
 * @Date: 2020/5/27 18:09
 * TreeSet有参构造
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge() - s2.getAge();
                int num2 = num==0?s1.getName().compareTo(s2.getName()):num;
                return num2;
            }
        });

        Student s1 = new Student("aa",11);
        Student s2 = new Student("bb",77);
        Student s3 = new Student("cc",33);
        Student s4 = new Student("dd",44);
        Student s5 = new Student("ba",77);

        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);
        treeSet.add(s5);

        for (Student s:treeSet){
            System.out.println("姓名："+s.getName()+"  年龄："+s.getAge());
        }

        /**
         * 姓名：aa  年龄：11
         * 姓名：cc  年龄：33
         * 姓名：dd  年龄：44
         * 姓名：ba  年龄：77
         * 姓名：bb  年龄：77
         */

    }
}
