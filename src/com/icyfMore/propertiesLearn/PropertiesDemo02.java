package com.icyfMore.propertiesLearn;

import java.util.Properties;
import java.util.Set;

/**
 * @Author: ESy
 * @Date: 2020/5/30 15:34
 *
 * Properties 集合特有方法
 *
 * Object setProperty(String key, String value)
 * 致电 Hashtable方法 put 。
 *
 * String getProperty(String key)
 * 使用此属性列表中指定的键搜索属性。
 *
 * Set<String> stringPropertyNames()
 * 返回此属性列表中的一组键，其中键及其对应的值为字符串，包括默认属性列表中的不同键，如果尚未从主属性列表中找到相同名称的键。
 *
 */
public class PropertiesDemo02 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        //Object setProperty(String key, String value)
        prop.setProperty("1", "11111");
        prop.setProperty("2", "22222");
        prop.setProperty("3", "33333");

        System.out.println(prop); //{3=33333, 2=22222, 1=11111}

        //String getProperty(String key)
        System.out.println(prop.get("1"));

        //Set<String> stringPropertyNames()
        Set<String> keys = prop.stringPropertyNames();
        for (String key : keys){
            System.out.println(key+","+prop.get(key));
        }


    }
}
