package com.icyf.threePoke;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * @Author: ESy
 * @Date: 2020/5/25 22:26
 */
public class Poke {
    public static void main(String[] args) {
        String color[] = {"♠","♥","♦","♣"};
        String num[] = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        int count = 0;
        ArrayList<Integer> giveCard = new ArrayList<>();
        HashMap<Integer,String> map = new HashMap<>();

        for (int i=0;i<num.length;i++){
            for (int j=0;j<color.length;j++){
                map.put(count,color[j]+num[i]);
                giveCard.add(count);
                count++;
            }
        }

        map.put(count,"大王");
        giveCard.add(count);
        count++;
        map.put(count,"小王");
        giveCard.add(count);

        //洗牌
        Collections.shuffle(giveCard);

        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        TreeSet<Integer> dpCard = new TreeSet<>();

        for (int i = 0;i<giveCard.size();i++){
            int card = giveCard.get(i);
            if (i>=giveCard.size()-3) dpCard.add(card);
            else if (i % 3 == 0) player1.add(card);
            else if (i % 3 == 1) player2.add(card);
            else if (i % 3 == 2) player3.add(card);
        }


        //看牌
        for (int i : player1){
            System.out.print(map.get(i)+"\t");
        }
        System.out.println();
        for (int i : player2){
            System.out.print(map.get(i)+"\t");
        }
        System.out.println();
        for (int i : player3){
            System.out.print(map.get(i)+"\t");
        }
        System.out.println();
        for (int i : dpCard){
            System.out.print(map.get(i)+"\t");
        }


    }

}
