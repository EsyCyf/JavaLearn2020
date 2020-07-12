package com.icyf.mapLearn;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ESy
 * @Date: 2020/5/27 21:21
 */
public class MapApi01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("100","111");
        map.put("200","222");
        map.put("300","333");

        System.out.println(map); //{100=111, 200=222, 300=333}

        map.remove("100"); //{200=222, 300=333}
        System.out.println(map);

        System.out.println(map.containsValue("222")); //true




    }
}
