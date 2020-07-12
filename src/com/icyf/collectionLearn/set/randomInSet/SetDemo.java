package com.icyf.collectionLearn.set.randomInSet;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author: ESy
 * @Date: 2020/5/27 18:53
 * 随机存储10个1-20的随机数
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        Random r = new Random();

        while (set.size()<10){
            int i = r.nextInt(20)+1;
            set.add(i);
        }

        System.out.println(set);

    }
}
