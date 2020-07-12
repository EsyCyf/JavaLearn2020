package com.icyf.javaLearn;

/**
 * @Author: ESy
 * @Date: 2020/5/23 14:22
 */
public class HelloWorldddd {
    public static void main(String[] args) {
        System.out.println("Hello world,see you again and again!");
        //Hello world,see you again and again!
        HelloWorldddd helloWorldddd = new HelloWorldddd();
        helloWorldddd.starPrint(10);

    }
    public void starPrint(int length){
        int i = 0;
        int j = 0;
        for(i=2;i>=0;i--){
            for (j=0;j<length+1;j++) {
                if (j==i||j==length-i||(i==1&&(j==i+2||j==length-(i+2)))){
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        for (;i<=(length/2);i++){
            for (j=0;j<=length;j++){
                if (j==i||j==length-i){
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
