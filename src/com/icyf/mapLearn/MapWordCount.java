package com.icyf.mapLearn;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author: ESy
 * @Date: 2020/5/27 22:37
 */
public class MapWordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符串");
        String s = sc.nextLine();

        HashMap<Character,Integer> hashMap = new HashMap<>();

        for (int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if (hashMap.containsKey(c)){
                hashMap.replace(c,hashMap.get(c)+1);
            }else {
                hashMap.put(c,1);
            }
        }

        for (char c : hashMap.keySet()){
            System.out.print(c+"("+hashMap.get(c)+")");
        }


    }
}
