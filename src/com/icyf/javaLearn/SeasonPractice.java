package com.icyf.javaLearn;

import java.util.Scanner;

/**
 * @Author: ESy
 * @Date: 2020/5/25 13:42
 */
public class SeasonPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入当前月份：");
        int i = scanner.nextInt();
        switch (i){
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
                default:
                    System.out.println("输入的月份有误");


        }


    }
}
