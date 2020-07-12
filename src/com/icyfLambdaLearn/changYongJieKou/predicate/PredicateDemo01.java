package com.icyfLambdaLearn.changYongJieKou.predicate;

import java.util.function.Predicate;

/**
 * @Author: ESy
 * @Date: 2020/6/2 16:44
 *
 * boolean test(T t)
 * 在给定的参数上评估这个谓词。
 *
 * default Predicate<T> negate()
 * 返回表示此谓词的逻辑否定的谓词。
 * default Predicate<T> negate() {
 *         return (var1) -> {
 *             return !this.test(var1);
 *         };
 *     }
 */
public class PredicateDemo01 {
    public static void main(String[] args) {

        boolean b1 = checkString("hello", s ->
                s.length() > 8
        );
        System.out.println(b1);


    }

    private static boolean checkString(String s, Predicate<String> p){
//        return p.test(s);
        return p.negate().test(s);
    }
}
