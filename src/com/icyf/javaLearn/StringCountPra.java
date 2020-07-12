package com.icyf.javaLearn;

import java.util.Scanner;

/**
 * @Author: ESy
 * @Date: 2020/5/25 15:14
 */
public class StringCountPra {
    public static void main(String[] args) {
        //创建Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入字符串：");
        //获得输入的字符串
        String next = sc.next();

        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;
        int otherCount = 0;

        for (int i =0;i<next.length();i++){
            char c = next.charAt(i);
            if(c>='0'&&c<='9') numCount++;
            else if (c>='a'&&c<='z') smallCount++;
            else if (c>='A'&&c<='Z') bigCount++;
            else otherCount++;
        }

        System.out.println("大写字母有"+bigCount+"个");
        System.out.println("小写字母有"+smallCount+"个");
        System.out.println("数字有"+numCount+"个");
        System.out.println("其他字符"+otherCount+"个");

        /**
         * 请输入字符串：
         * Esy@1997
         * 大写字母有1个
         * 小写字母有2个
         * 数字有4个
         * 其他字符1个
         */

    }
}
