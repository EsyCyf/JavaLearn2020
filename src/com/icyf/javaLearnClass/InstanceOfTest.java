package com.icyf.javaLearnClass;

/**
 * @Author: ESy
 * @Date: 2020/5/24 17:40
 */
public class InstanceOfTest {
    public static void main(String[] args) {
        //x instanceof A :检验x是否为类A的对象（包括子类）
        Person p = new Person();
        Student s = new Student();
        Person stu = new Student();

        System.out.println(s instanceof Person); //true
        System.out.println(stu instanceof Person); //true
        System.out.println(p instanceof Student); //false
    }
}
