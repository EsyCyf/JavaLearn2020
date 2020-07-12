package com.icyf.mapLearn.andArrayList;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Author: ESy
 * @Date: 2020/5/27 22:05
 */
public class ArrayListInHashMap {
    public static void main(String[] args) {
        HashMap<String,ArrayList<String>> hashMap = new HashMap<>();

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("哈哈哈");
        arrayList1.add("呵呵呵");
        arrayList1.add("嘻嘻嘻");
        hashMap.put("1",arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("不是");
        arrayList2.add("不会吧");
        arrayList2.add("不能把");
        hashMap.put("2",arrayList2);

        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("无敌了");
        arrayList3.add("宣布了");
        arrayList3.add("基地");
        hashMap.put("3",arrayList3);

        for (String key:hashMap.keySet()){
            System.out.print(key+":");
            for (String s : hashMap.get(key)){
                System.out.print(s+" ");
            }
            System.out.println();
        }




    }
}
