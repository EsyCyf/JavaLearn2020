package com.icyfLambdaLearn.Demo04;

/**
 * @Author: ESy
 * @Date: 2020/6/1 23:02
 */
public class AddableDemo {
    public static void main(String[] args) {

//        useAddable((int x,int y)-> {
//            return x+y;
//        });

        //如果代码块语句只有一条，可以省略大括号和分号,如果有return，return要省略
//        useAddable((int x,int y)-> x+y);
        //类型可以省略，多个参数要么都省略，不能个别省略
        useAddable((x,y)-> x+y);
    }

    private static void useAddable(Addable a){
        int add = a.add(10, 20);
        System.out.println(add);
    }
}
