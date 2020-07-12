package com.icyf.genericLearn;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ESy
 * @Date: 2020/5/27 20:56
 * 4.5类型通配符
 * 为了表示各种泛型List的父类，可以使用类型通配符
 * ●类型通配符: <?>
 * ●List<?>: 表示元素类型未知的List,它的元素可以匹配任何的类型
 * ●这种带通配符的List仅表示它是各种泛 型List的父类,并不能把元素添加到其中
 * 如果说我们不希望List<?>是任何泛型ist的父类，只希望它代表某一泛型List的父类，可以使用类型通配符的上限
 * ●类型通配符 上限: <? extends类型>
 * ●List<? extends Number>:它表示的类型是Number或者其子类型
 * 除了可以指定类型通配符的上限，我们也可以指定类型通配符的下限
 * ●类型通配符 下限: <? super 类型>
 * List<? super Number>:它表示的类型是Number或者其父类型
 */
public class TongPeiFu {
    public static void main(String[] args) {
        //这种带通配符的List仅表示它是各种泛 型List的父类,并不能把元素添加到其中
        List<?> list1 = new ArrayList<String>();
        List<?> list2 = new ArrayList<Integer>();
        List<?> list3 = new ArrayList<Object>();

        //上限 extends
//        List<? extends Integer> list4 = new ArrayList<String>(); //报错
        List<? extends Object> list4 = new ArrayList<Integer>();

        //下限 super
//        List<? super Object> list5 = new ArrayList<Integer>(); //报错
        List<? super Object> list5 = new ArrayList<Object>();



    }
}
