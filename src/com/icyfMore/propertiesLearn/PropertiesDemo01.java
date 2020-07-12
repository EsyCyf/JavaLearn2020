package com.icyfMore.propertiesLearn;

import java.util.Properties;
import java.util.Set;

/**
 * @Author: ESy
 * @Date: 2020/5/30 15:30
 *
 * public class Properties extends Hashtable<Object,Object>
 *
 * Properties类表示一组持久的属性。
 * Properties可以保存到流中或从流中加载。
 * 属性列表中的每个键及其对应的值都是一个字符串。
 *
 * Properties()
 * 创建一个没有默认值的空属性列表。
 * Properties(Properties defaults)
 * 创建具有指定默认值的空属性列表。
 *
 *
 * 和Map集合使用方式一致
 */
public class PropertiesDemo01 {
    public static void main(String[] args) {
        //创建集合对象Properties,无法指定泛型
        Properties prop = new Properties();

        //存储元素
        prop.put("haha","haha");
        prop.put("hehe","hehe");
        prop.put("xixi","xixi");

        Set<Object> keySet = prop.keySet();
        for (Object key:keySet){
            Object values = prop.get(key);
            System.out.println(key+","+values);

        }

    }
}
