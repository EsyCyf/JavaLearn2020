package com.icyf.javaLearn;

import java.util.Arrays;

/**
 * @Author: ESy
 * @Date: 2020/5/23 23:19
 */
public class ArraryTest {
    public static void main(String[] args) {
        int[] arr1 = {9,7,6,4,3,4};

        //冒泡排序
        int i,j,temp;
        for (i=0;i<arr1.length;i++){
            for (j=0;j<arr1.length-i-1;j++){
                if (arr1[j]>arr1[j+1]){
                    temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }

            }
        }

        for (int arr:arr1){
            System.out.print(arr+"\t"); //3	4	4	6	7	9
        }


        System.out.println();


        //数组拷贝
        int[] copyArr = Arrays.copyOf(arr1,arr1.length);
        for (int c : copyArr){
            System.out.print(c+"\t"); //3	4	4	6	7	9
        }


    }


}
