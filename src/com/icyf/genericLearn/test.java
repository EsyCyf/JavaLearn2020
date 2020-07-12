package com.icyf.genericLearn;

/**
 * @Author: ESy
 * @Date: 2020/5/27 20:37
 */
public class test {
    public static void main(String[] args) {
        Generic<String> g1 = new Generic<>();
        Generic<Integer> g2 = new Generic<>();
        Generic<Double> g3 = new Generic<>();

        g1.setT("String");
        g2.setT(100);
        g3.setT(99.99);


        test.show(g1.getT());
        test.show(g2.getT());
        test.show(g3.getT());

        //String
        //100
        //99.99

        GenericInterface<String> gi = new GenericInterfaceImpl<>();
        gi.show("100"); //100


    }

    //泛型方法
    public static <T> void show(T t){
        System.out.println(t);

    }
}
