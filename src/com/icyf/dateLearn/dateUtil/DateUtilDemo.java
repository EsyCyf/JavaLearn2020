package com.icyf.dateLearn.dateUtil;

import java.text.ParseException;
import java.util.Date;

/**
 * @Author: ESy
 * @Date: 2020/5/26 20:24
 */
public class DateUtilDemo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();

        String format = "yyyy年MM月dd HH:mm:ss";

        String day = "2020年5月26 20:20:01";

        System.out.println(DateUtil.dateToString(date, format)); //2020年05月26 20:28:27
        System.out.println(DateUtil.stringToDate(day,format)); //Tue May 26 20:20:01 CST 2020
    }
}
