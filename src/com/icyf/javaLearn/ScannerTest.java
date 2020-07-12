package com.icyf.javaLearn;

import java.util.Scanner;

/**
 * @Author: ESy
 * @Date: 2020/5/24 14:43
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //获取一行的数据
        System.out.println("请输入的昵称");
        String username = scanner.nextLine();

        //获取一个单词（以空白符作分隔）
        System.out.println("请输入姓名");
        String name = scanner.next();

        //获取一个整数
        System.out.println("请输入年龄");
        int age = scanner.nextInt();

        //获取一个浮点数
        System.out.println("请输入你的身高（cm）");
        double height = scanner.nextDouble();

        System.out.println(name.substring(0,1)+"先生您好!\n您的昵称为："+username
                +"\n年龄："+age+"\n身高："+height+"cm");

        /**
         * 请输入的昵称
         * hello shit
         * 请输入姓名
         * 陈逸飞
         * 请输入年龄
         * 23
         * 请输入你的身高（cm）
         * 179.9
         * 陈先生您好!
         * 您的昵称为：hello shit
         * 年龄：23
         * 身高：179.9cm
         */
    }
}
