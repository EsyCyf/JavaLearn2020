package com.icyf.mapLearn;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ESy
 * @Date: 2020/5/27 21:29
 */
public class MapApi02 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("100","111");
        map.put("200","222");
        map.put("300","333");

        //根据键 获取值
        System.out.println(map.get("100")); //111

        //获取所有键的Set集合
        for (String key: map.keySet()){
            System.out.print(key+" ");
        } //100 200 300


        System.out.println();
        //获取所有值的Collection集合
        for (String value : map.values()){
            System.out.print(value+" ");
        } //111 222 333


    }
}
