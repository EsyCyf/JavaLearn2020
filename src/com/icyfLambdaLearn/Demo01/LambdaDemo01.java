package com.icyfLambdaLearn.Demo01;

/**
 * @Author: ESy
 * @Date: 2020/6/1 22:34
 */
public class LambdaDemo01 {
    public static void main(String[] args) {
        //实例类的方式实现需求,需要创建类
//        new Thread(new MyRunnable()).start();


        //匿名内部类实现，格式复杂
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类啊啊啊啊啊啊啊啊啊啊啊");
            }
        }).start();*/

        //Lambda表达式
        new Thread(()->{
            System.out.println("Lambda表达式啊啊啊啊啊啊啊啊啊啊啊");
        }).start();



    }
}
