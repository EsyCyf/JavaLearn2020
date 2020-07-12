package com.icyf.collectionLearn.list.listStudent;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ESy
 * @Date: 2020/5/27 15:26
 */
public class ListDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        //创建学生对象
        Student s1 = new Student("一号",10);
        Student s2 = new Student("二号",20);
        Student s3 = new Student("三号",30);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (Student student:list){
            System.out.println(student.toString());
        }
    }
}
