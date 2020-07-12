package com.icyf.arrayListLearn;

import java.util.ArrayList;

/**
 * @Author: ESy
 * @Date: 2020/5/25 16:13
 */
public class ArraryListTest {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("100");
        array.add("200");
        array.add("300");

        //从列表中删除所有元素。
        array.clear();
        System.out.println(array); //[100, 200, 300]


    }



}
