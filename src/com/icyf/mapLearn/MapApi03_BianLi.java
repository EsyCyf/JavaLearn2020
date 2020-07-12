package com.icyf.mapLearn;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: ESy
 * @Date: 2020/5/27 21:34
 */
public class MapApi03_BianLi {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("100","111");
        map.put("200","222");
        map.put("300","333");

        //方法一，先获取Key的Set集合，再根据Key取值
        for (String key : map.keySet()){
            System.out.println("("+key+","+map.get(key)+")");
        }
        //(100,111)
        //(200,222)
        //(300,333)


        //方法二，entrySet(),返回此地图中包含的映射的Set视图。
        // 返回类型：Set<Map.Entry<K,V>>
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> m : entries){
            String key = m.getKey();
            String value = m.getValue();
            System.out.println("("+key+","+value+")");
        }
        //(100,111)
        //(200,222)
        //(300,333)


    }
}
