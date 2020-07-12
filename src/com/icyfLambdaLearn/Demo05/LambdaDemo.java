package com.icyfLambdaLearn.Demo05;

/**
 * @Author: ESy
 * @Date: 2020/6/1 23:17
 */
public class LambdaDemo {
    public static void main(String[] args) {
        //必须有上下文环境，才能推导出Lambda对应的接口
        new Thread(()-> System.out.println("HAHA")).start();

        Inter i = System.out::println;
        i.show("xixi");

    }

//    private static void useInter(Inter i){
//        i.show();
//    }
}
