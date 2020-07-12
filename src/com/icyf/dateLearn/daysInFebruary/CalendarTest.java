package com.icyf.dateLearn.daysInFebruary;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @Author: ESy
 * @Date: 2020/5/26 21:05
 * 获取任意一年的二月有多少天
 *
 */
public class CalendarTest {
    public static void main(String[] args) {
        //键盘输入年份
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();

        //设置对应年份的年月日（3月1日）
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,2,1); //月份从0开始，所以3月为2

        //3月1日往前一天，就是2月的最后一天
        calendar.add(Calendar.DATE,-1);

        //获取二月最后一天的日期，即二月的天数
        int day = calendar.get(Calendar.DATE);

        System.out.println(year+"年2月有："+day+"天");

        /**
         * 请输入年份：
         * 2009
         * 2009年2月有：28天
         *
         * 请输入年份：
         * 2008
         * 2008年2月有：29天
         */
    }
}
