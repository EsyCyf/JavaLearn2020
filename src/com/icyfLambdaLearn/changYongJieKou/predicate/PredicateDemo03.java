package com.icyfLambdaLearn.changYongJieKou.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @Author: ESy
 * @Date: 2020/6/2 17:50
 * String[]strArray= {"林青霞30", "柳岩,34", "张曼玉,35", "貂蝉31",“王祖贤,33"};
 * 字符串数组中有多条信息，请通过Predicate接口的拼装将符合要求的字符串筛选到集合ArrayList中,并遍历ArrayList集合
 * 同时满足如下要求:姓名长度大于2;年龄大于33
 * 分析
 * 有两个判断条件,所以需要使用两个Predicate接口，对条件进行判断
 * 必须同时满足两个条件,所以可以使用and方法连接两个判断条件
 */
public class PredicateDemo03 {
    public static void main(String[] args) {
        String[]strArray= {"林青霞,30", "柳岩,34", "张曼玉,35", "貂蝉,31","王祖贤,33"};
        ArrayList<String> arrayList = myFilter(strArray,
                s -> s.split(",")[0].length() > 2,
                s -> Integer.parseInt(s.split(",")[1]) > 33);

        for (String s : arrayList){
            System.out.println(s);
        }

    }

    private static ArrayList<String> myFilter(String[] strings, Predicate<String> p1, Predicate<String> p2){
        ArrayList<String> arrayList = new ArrayList<>();
        for (String s : strings){
            if (p1.and(p2).test(s)){
                arrayList.add(s);
            }
        }


        return arrayList;
    }
}
