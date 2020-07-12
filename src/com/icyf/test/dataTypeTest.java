package com.icyf.test;

import java.util.ArrayList;

/**
 * @Author: ESy
 * @Date: 2020/5/23 15:04
 */
public class dataTypeTest {

    public static void main(String[] args) {
       /* byte b = 127;   //-128~127
        //byte b = 128; error

        System.out.println(String.join("1","a","b","c")); //a1b1c
        String str1 = "HELLO 2020";
        int begin = str1.indexOf("2",7); //返回xx第一次出现的索引
        int last = str1.lastIndexOf("2",7); //返回xx最后一次出现的索引
        System.out.println(begin); //6
        System.out.println(last); //8

        begin = str1.indexOf("2",7); //返回xx第一次出现的索引,从第7（6）位开始到末尾
        last = str1.lastIndexOf("2",7); //返回xx最后一次出现的索引，从第7（6）位开始到开头
        System.out.println(begin); //8
        System.out.println(last); //6*/


       String string = new String(new byte[]{1,2,3});

        ArrayList arrayList = new ArrayList();
        arrayList.add("1");
        System.out.println(arrayList.isEmpty());

        System.out.println(Math.pow(10,-1));

        System.out.println(string);
        System.out.println(string.toString());
        System.out.println(string.toString().toString());





    }
}
