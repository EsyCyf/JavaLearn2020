package com.icyfLambdaLearn.Demo03;

/**
 * @Author: ESy
 * @Date: 2020/6/1 22:52
 */
public class FlyableDemo {
    public static void main(String[] args) {
        //匿名内部类
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
            }
        },"hehe");


        //Lambda表达式
//        useFlyable((String s)->{
//            System.out.println(s);
//        },"xixi");

        //类型可以省略，参数只有一个时，小括号可以省略
//        useFlyable(s->{
//            System.out.println(s);
//        },"xixi");

        //如果代码块语句只有一条，可以省略大括号和分号,如果有return，return要省略
        useFlyable(s-> System.out.println(s),"xixi");

        useFlyable(System.out::println,"xixi");

    }

    private static void useFlyable(Flyable f,String s){
        f.fly(s);
    }
}
