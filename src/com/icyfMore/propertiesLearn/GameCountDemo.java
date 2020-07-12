package com.icyfMore.propertiesLearn;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author: ESy
 * @Date: 2020/5/30 16:07
 * 需求:
 *      请写程序实现猜数字小游戏只能试玩3次，如果还想玩，提标:游戏试玩E结束，想玩请充值(www.itcast.cn)
 * 思路:
 *      ①写一个游戏类，里面有一 个猜数字的小游戏
 *      ②写一个测试类,测试类中有main0方法, main0方法中按照下面步骤完成:
 *          A:从文件中读取数据到Properties集合，用load0方法实现
 *              文件已经存在: game.txt
 *              里面有-个数据值: count=0
 *          B:通过Properties集合获取到玩游戏的次数
 *          C:判断次数是否到到3次了
 *              如果到了，给出提示:游戏试玩已结束，想玩请充值(www.itcast.cn)
 *              如果不到3次:
 *                  玩游戏
 *                  次数+1.重新写回文件，用Properties的store(方法实现
 */
public class GameCountDemo {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();

        FileReader fr = new FileReader("ser\\gameCount.txt");
        prop.load(fr);
        fr.close();

        String count = prop.getProperty("count");
        int number = Integer.parseInt(count);

        if (number >= 3){
            System.out.println("游戏试玩已经结束，想试玩请充值");

        }else {
            GameNumber.strat();

            number++;
            prop.setProperty("count", String.valueOf(number));
            FileWriter fw = new FileWriter("ser\\gameCount.txt");
            prop.store(fw,null);
            fw.close();


        }


    }
}
