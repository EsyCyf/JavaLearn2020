package com.icyf.apiTest;

import java.util.Arrays;

/**
 * @Author: ESy
 * @Date: 2020/5/26 17:59
 * 将字符串中的数据排序，最后返回一个字符串
 */
public class StringAndint {
    public static void main(String[] args) {
        String str = "66 33 11 6 22 999";
        //以空格切分字符串
        String[] split = str.split(" ");
        //创建长度相等的int数组
        int[] num = new int[split.length];
        //遍历切分好的字符串数组 转为int 存入int数组中
        for (int i = 0;i<split.length;i++){
            num[i] = Integer.parseInt(split[i]);
        }
        //int数组排序
        Arrays.sort(num);
        //遍历排序好的int数组 转为String 拼接
        StringBuilder sb = new StringBuilder();
        for (int i:num){
            sb.append(i).append(" ");
        }

        String s = sb.toString();
        System.out.println(s);


    }
}
