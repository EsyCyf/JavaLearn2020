package com.icyf.abstractLearn;

/**
 * @Author: ESy
 * @Date: 2020/5/26 15:27
 */
public abstract class Animal {
    String type = null;
    int age = 0;

    //抽象方法必须写在抽象类中
    public abstract void eat();
    //抽象方法中可以写普通方法，不一定要有一个抽象方法
    public void sleeo(){
        System.out.println("睡觉");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
