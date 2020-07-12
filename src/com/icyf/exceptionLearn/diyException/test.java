package com.icyf.exceptionLearn.diyException;

import java.util.Scanner;

/**
 * @Author: ESy
 * @Date: 2020/5/26 21:57
 */
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数");
        int i = sc.nextInt();
        try {
            new Teacher().checkScore(i);
        } catch (ScoreException e) {
            e.printStackTrace();
        }

        /**
         * com.icyf.exceptionLearn.diyException.ScoreException: 分数有误，超出范围
         * 	at com.icyf.exceptionLearn.diyException.Teacher.checkScore(Teacher.java:11)
         * 	at com.icyf.exceptionLearn.diyException.test.main(test.java:15)
         */
    }
}
