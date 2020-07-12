package com.icyf.genericLearn;

/**
 * @Author: ESy
 * @Date: 2020/5/27 21:05
 */
public class KeBianCanShu {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5,6,7)); //28

    }

    //可变参数a是个数组,如果一个方法包含多个参数，可变参数应写在（）最后
    public static int sum(int... a){
        int sum = 0;
        for (int i:a){
            sum+=i;
        }
        return sum;
    }
}
