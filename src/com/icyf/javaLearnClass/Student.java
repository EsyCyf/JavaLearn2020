package com.icyf.javaLearnClass;

/**
 * @Author: ESy
 * @Date: 2020/5/24 16:36
 */
public class Student extends Person{
    private String stuId = null ;



//    public Student(String name, int age, String stuId) {
//        super(name, age);
//        this.stuId = stuId;
//    }


    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    @Override
    public void show() {
        System.out.println("这是student类的show方法");
    }


}
