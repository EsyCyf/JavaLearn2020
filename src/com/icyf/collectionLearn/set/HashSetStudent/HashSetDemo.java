package com.icyf.collectionLearn.set.HashSetStudent;

import java.util.HashSet;

/**
 * @Author: ESy
 * @Date: 2020/5/27 17:30
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();

        Student s1 = new Student("一号",10);
        Student s2 = new Student("二号",10);
        Student s3 = new Student("二号",20);
        Student s4 = new Student("一号",10);

        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
        hashSet.add(s4);

        for (Student student : hashSet){
            System.out.println(student.toString());
        }

        /**
         * Student{name='二号', age=20}
         * Student{name='一号', age=10}
         * Student{name='二号', age=10}
         */

    }
}
