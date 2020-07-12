package com.icyf.javaLearn;

import java.util.Random;

/**
 * @Author: ESy
 * @Date: 2020/5/25 13:55
 */
public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();


        //随机生成1-100之间的一个数
        int i = random.nextInt(100)+1;


        System.out.println(i);

    }
}
