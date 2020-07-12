package com.icyf.collectionLearn.set;

import java.util.TreeSet;

/**
 * @Author: ESy
 * @Date: 2020/5/27 17:39
 */
public class TreeSetLearn {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(543);
        treeSet.add(32);
        treeSet.add(4);
        treeSet.add(654);
        treeSet.add(3);
        treeSet.add(554);

        for (int i : treeSet){
            System.out.println(i);
        }
        /**
         * 3
         * 4
         * 32
         * 543
         * 554
         * 654
         */

    }
}
