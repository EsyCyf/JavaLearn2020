package com.icyfStream.DemoActor;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @Author: ESy
 * @Date: 2020/6/2 20:41
 *
 * 1.5 Stream流的练习
 * 现在有两个ArrayList集合，分别存储6名男演员名称和6名女演员名称,要求完成如下的操作
 * 男演员只要名字为3个字的前三人
 * ●
 * 女演员只要姓林的，并且不要第一个
 * ●把过滤后的男演员姓名和女演员姓名合并到一 起
 * ●把上一 步操作后的元素作为构造方法的参数创建演员对象遍历数据
 * 演员类Actor已经提供，里面有一个成员变量， -个带参构造方法,以及成员变量对应的get/set方法
 *
 */
public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<>();
        manList.add("周润发");
        manList.add("成龙");
        manList.add("刘德华");
        manList.add("吴京");
        manList.add("周星驰");
        manList.add("李连杰");


        ArrayList<String> womanList = new ArrayList<>();
        womanList.add("林心如");
        womanList.add("张曼玉");
        womanList.add("林青霞");
        womanList.add("柳岩");
        womanList.add("林志玲");
        womanList.add("王祖贤");

        //男演员只要名字为3个字的前三人
        Stream<String> manStream = manList.stream().filter(s -> s.length() == 3).limit(3);

        //女演员只要姓林的，并且不要第一个
        Stream<String> womanStream = womanList.stream().filter(s -> s.startsWith("林")).skip(1);

        //合并流
        Stream<String> finalStream = Stream.concat(manStream, womanStream);

        //把上一步操作后的元素作为构造方法的参数创建演员对象遍历数据
        finalStream.map(Actor::new).forEach(s-> System.out.println(s.getName()));

    }
}
