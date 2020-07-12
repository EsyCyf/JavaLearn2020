package com.icyfMore.propertiesLearn;

import java.util.Random;
import java.util.Scanner;

/**
 * @Author: ESy
 * @Date: 2020/5/30 16:08
 */
public class GameNumber {
    private GameNumber() {
    }

    public static void strat(){
        Random r = new Random();
        int number = r.nextInt(20)+1;

        while (true){
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入你要猜的数组：");
            int guessNum = sc.nextInt();

            if (guessNum > number){
                System.out.println(guessNum+"大了");
            }else if (guessNum < number){
                System.out.println(guessNum+"小了");
            }else {
                System.out.println(guessNum+"!你猜中了");
                break;
            }


        }

    }
}
