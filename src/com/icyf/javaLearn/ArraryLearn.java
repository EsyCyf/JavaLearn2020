package com.icyf.javaLearn;

/**
 * @Author: ESy
 * @Date: 2020/5/23 22:17
 */
public class ArraryLearn {
    public static void main(String[] args) {
        /*int[] aa = new int[5]; //第一种声明方式（赋值可以随意）
        int bb[]={1,2,3,4,5}; //第二种声明方式
        int cc[] = new int[]{1,2,3,4,5};
        System.out.println(aa.length);
        System.out.println(bb[4]);
        for(int i:aa){
            System.out.println(i);
        }*/

        int[][] arr1 = new int[3][];
        arr1[0] = new int[]{1};
        arr1[1] = new int[]{2,3};
        arr1[2] = new int[]{4,5,6};
        System.out.println(arr1.length);//3

        int[][] arr2 = {{1,1},{2,2,2},{3},{4,4,4,4,4}};
        System.out.println(arr2.length); //4
        System.out.println(arr2[0].length); //2

        //遍历二维数组，并计算每行的length
        for (int i = 0;i < arr2.length;i++){
            System.out.println("arr["+i+"]长度为："+arr2[i].length);
            for (int j = 0;j < arr2[i].length;j++){
                System.out.print("arr["+i+"]"+"["+j+"]="+arr2[i][j]+"\t");
            }
            System.out.println();
        }
        /***
         * arr[0]长度为：2
         * arr[0][0]=1	arr[0][1]=1
         * arr[1]长度为：3
         * arr[1][0]=2	arr[1][1]=2	arr[1][2]=2
         * arr[2]长度为：1
         * arr[2][0]=3
         * arr[3]长度为：5
         * arr[3][0]=4	arr[3][1]=4	arr[3][2]=4	arr[3][3]=4	arr[3][4]=4
         */

        int[] b[];

    }
}
