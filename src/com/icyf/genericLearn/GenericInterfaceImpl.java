package com.icyf.genericLearn;

/**
 * @Author: ESy
 * @Date: 2020/5/27 20:50
 */
public class GenericInterfaceImpl<T> implements GenericInterface<T> {

    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
