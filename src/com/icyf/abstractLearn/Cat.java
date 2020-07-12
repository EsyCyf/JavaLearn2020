package com.icyf.abstractLearn;

/**
 * @Author: ESy
 * @Date: 2020/5/26 15:29
 */
public class Cat extends Animal{
    @Override
    public void sleeo() {
        System.out.println("猫猫睡觉");;
    }


    int age1 = 10;

    public Cat() {
    }


    @Override
    public void eat() {
        System.out.println("猫吃吃吃");
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge1() {
        return age1;
    }

    public void setAge1(int age1) {
        this.age1 = age1;
    }
}
