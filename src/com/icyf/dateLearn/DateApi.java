package com.icyf.dateLearn;

import java.util.Date;

/**
 * @Author: ESy
 * @Date: 2020/5/26 18:22
 */
public class DateApi {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date); //Tue May 26 18:24:43 CST 2020

        long l = 1000;
        Date date1 = new Date(l);
        System.out.println(date1); //Thu Jan 01 08:00:01 CST 1970
        //分配一个 Date对象，并将其初始化为表示自称为“时代”的标准基准时间以后的指定毫秒数，即1970年1月1日00:00:00 GMT。

        System.out.println(date1.getTime()); //1000
        //返回自1970年1月1日00:00:00以来的毫秒数 。

        date1.setTime(l);
        System.out.println(date1); //Thu Jan 01 08:00:01 CST 1970
        //设置Date对象以表示1970年1月1日00:00:00之后的毫秒的时间点
    }
}
