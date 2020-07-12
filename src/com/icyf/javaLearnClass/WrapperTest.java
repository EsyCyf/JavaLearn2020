package com.icyf.javaLearnClass;

/**
 * @Author: ESy
 * @Date: 2020/5/24 20:15
 */
public class WrapperTest {
    public static void main(String[] args) {
        Integer integer1 = new Integer(10); //装箱
        int i1 = integer1.intValue(); //拆箱

        Integer integer2 = 10; //自动装箱
        int i2 = integer2 ; //自动拆箱

        String s = "110";
        int i3 = Integer.parseInt(s,2); //将字符串转为整型，设置来源为2进制
        System.out.println(i3);

    }
}
