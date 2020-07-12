package com.icyf.dateLearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: ESy
 * @Date: 2020/5/26 18:35
 */
public class LearnSimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();

        /*SimpleDateFormat sdf = new SimpleDateFormat();
        System.out.println(sdf.format(date)); //20-5-26 下午6:40*/


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd HH:mm:ss");
        //Date到String
        String s = sdf.format(date);
        System.out.println(s); //2020年05月26 18:42:19

        //String到Date
        String ss = "2020年5月20 8:8:8";
        Date date1 = sdf.parse(ss);
        System.out.println(date1); //Wed May 20 08:08:08 CST 2020


    }
}
