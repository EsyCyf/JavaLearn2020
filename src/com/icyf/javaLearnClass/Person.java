package com.icyf.javaLearnClass;

/**
 * @Author: ESy
 * @Date: 2020/5/24 16:36
 */
public class Person {
    private String name = null;
    private int age = 0;

//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    @Override
    public String toString() {
        return "Person{" +
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

    public void show(){
        System.out.println("这是Preson类的show方法");
    }
}
