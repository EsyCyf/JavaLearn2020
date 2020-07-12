package com.icyfLambdaLearn.changYongJieKou.predicate;

import java.util.function.Predicate;

/**
 * @Author: ESy
 * @Date: 2020/6/2 17:46
 */
public class PredicateDemo02 {
    public static void main(String[] args) {
        boolean hello = checkString("hello",
                s -> s.length() > 1,
                s -> s.length() < 8);
        System.out.println(hello);

    }

    private static boolean checkString(String s, Predicate<String> p1, Predicate<String> p2) {
//        boolean b1 = p1.test(s);
//        boolean b2 = p2.test(s);
//        boolean b3 = b1 || b2;
//        boolean b3 = b1 && b2;
//        return b3;
//        return p1.or(p2).test(s);
        return p1.and(p2).test(s);

    }
}
