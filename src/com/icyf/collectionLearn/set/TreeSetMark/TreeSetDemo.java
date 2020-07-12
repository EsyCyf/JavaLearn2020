package com.icyf.collectionLearn.set.TreeSetMark;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author: ESy
 * @Date: 2020/5/27 18:23
 * TreeSet遍历学生成绩，要求顺序优先级 总分>语文>数学>英语>姓名
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num1 = s2.sum() - s1.sum() ;
                if (num1 == 0){
                    int num2 = s2.getChinese() - s1.getChinese();
                    if (num2 == 0){
                        int num3 = s2.getMath() - s1.getMath();
                        if (num3 ==0){
                            int num4 = s2.getEnglish() - s1.getEnglish();
                            if (num4 == 0){
                                int num5 = s2.getName().compareTo(s1.getName());
                                return num5;
                            }
                            return num4;
                        }
                        return num3;
                    }
                    return num2;
                }
                return num1;
            }
        });

        Student s1 = new Student("aa",100,100,100);
        Student s2 = new Student("bb",100,99,99);
        Student s3 = new Student("cc",99,101,100);
        Student s4 = new Student("dd",100,100,100);
        Student s5 = new Student("ba",100,99,99);

        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);
        treeSet.add(s5);

        for (Student s: treeSet){
            System.out.println(s.toString()+"总分："+s.sum());
        }
    }
}
