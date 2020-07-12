package com.icyf.apiTest;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: ESy
 * @Date: 2020/5/26 17:45
 */
public class ArraysApi {
    public static void main(String[] args) {
        int[] a = {3,5,6,8,2,5,32,5,4};

        System.out.println("a[]:"+Arrays.toString(a)); //[3, 5, 6, 8, 2, 5, 32, 5, 4]

        //数字顺序排序
        Arrays.sort(a);
        System.out.println("a[]:"+Arrays.toString(a)); //[2, 3, 4, 5, 5, 5, 6, 8, 32]

        //拷贝数组
        int[] b = Arrays.copyOf(a,a.length);
        System.out.println("b[]:"+Arrays.toString(b)); //[2, 3, 4, 5, 5, 5, 6, 8, 32]

//        List<Integer> integers = Arrays.asList(1, 3);


    }
}
