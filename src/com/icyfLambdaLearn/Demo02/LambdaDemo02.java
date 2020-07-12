package com.icyfLambdaLearn.Demo02;

/**
 * @Author: ESy
 * @Date: 2020/6/1 22:44
 *
 * lambda前提；
 * * 有一个接口
 * * 接口中有且仅有一个抽象方法
 */
public class LambdaDemo02 {
    public static void main(String[] args) {
        //多态调用
        ForDemo02 f = new ForDemo02Impl();
        useEat(f);

        //匿名内部类
        useEat(new ForDemo02() {
            @Override
            public void eat() {
                System.out.println("嘻嘻嘻嘻嘻匿名呀");
            }
        });

        //Lambda表达式
        useEat(()->{
            System.out.println("哈哈哈哈这是Lambda没想到吧");
        });

        useEat(()-> System.out.println("呵呵"));



    }




    private static void useEat(ForDemo02 f){
        f.eat();
    }
}
