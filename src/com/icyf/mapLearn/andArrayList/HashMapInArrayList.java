package com.icyf.mapLearn.andArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: ESy
 * @Date: 2020/5/27 21:58
 * 遍历ArrayList中的HashMap
 */
public class HashMapInArrayList {
    public static void main(String[] args) {
        //创建ArrayList集合
        ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();

        //创建HashMap hashMap1
        HashMap<String,String> hashMap1 = new HashMap<>();
        hashMap1.put("11","11111111");
        hashMap1.put("21","21111111");
        hashMap1.put("31","31111111");
        arrayList.add(hashMap1);

        //创建HashMap hashMap2
        HashMap<String,String> hashMap2 = new HashMap<>();
        hashMap2.put("12","1222222");
        hashMap2.put("22","2222222");
        hashMap2.put("32","3222222");
        arrayList.add(hashMap2);

        //创建HashMap hashMap1
        HashMap<String,String> hashMap3 = new HashMap<>();
        hashMap3.put("13","1333333");
        hashMap3.put("23","2333333");
        hashMap3.put("33","3333333");
        arrayList.add(hashMap3);

        for (HashMap<String,String> hashMap:arrayList){
            Set<Map.Entry<String, String>> entries = hashMap.entrySet();
            for (Map.Entry<String, String> m : entries){
                System.out.println(m.getKey()+" "+m.getValue());
            }
        }
        //11 11111111
        //31 31111111
        //21 21111111
        //22 2222222
        //12 1222222
        //32 3222222
        //33 3333333
        //23 2333333
        //13 1333333

    }
}
