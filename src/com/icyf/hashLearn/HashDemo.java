package com.icyf.hashLearn;

/**
 * @Author: ESy
 * @Date: 2020/5/27 16:40
 *
 * Hash哈希值：
 *  是JDK根据对象的地址或字符串或数字算出来的int类型的数值
 *
 * Object类中有个方法可以返回哈希值
 * public native int hashCode();
 * 该方法可以被重写
 */
public class HashDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println("s1: "+s1.hashCode()); //356573597
        System.out.println("s2: "+s2.hashCode()); //1735600054

        System.out.println("hello: "+"hello".hashCode()); //s21735600054
        System.out.println("world: "+"world".hashCode()); //113318802
        System.out.println("java: "+"java".hashCode()); //3254818

        System.out.println("你好: "+"你好".hashCode());
        System.out.println("世界: "+"世界".hashCode());


    }
}
