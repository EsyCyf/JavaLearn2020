package com.icyf.javaLearnClass;

/**
 * @Author: ESy
 * @Date: 2020/5/24 17:52
 */
public class EqualsTest {
    public static void main(String[] args) {

        /**
         * == 比较数值或（引用变量）内存引用地址
         * .equals() 比较对象内容
         */


        String str1 = "1" ;
        String str2 = str1 ;


        System.out.println(str1.equals(str2)); //true
        System.out.println(str1 == str2); //true

        String str3 = new String("1");
        String str4 = new String("1");

        System.out.println(str3.equals(str4)); //true
        System.out.println(str3 == str4); //false


        Person p1 = new Person();
        Person p2 = new Person();

        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));

        p1=p2;

        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));

    }

}
