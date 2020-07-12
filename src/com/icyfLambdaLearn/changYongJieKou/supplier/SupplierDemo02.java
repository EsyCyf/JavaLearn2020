package com.icyfLambdaLearn.changYongJieKou.supplier;

import java.util.function.Supplier;

/**
 * @Author: ESy
 * @Date: 2020/6/2 16:06
 *
 */
public class SupplierDemo02 {
    public static void main(String[] args) {
        int[] arr = {12,54,87,2,987};

        int maxValue = getMax(() -> {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            return max;
        });

        System.out.println(maxValue);


    }

    private static int getMax(Supplier<Integer> s){
        return s.get();
    }
}
