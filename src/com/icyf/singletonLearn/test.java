package com.icyf.singletonLearn;

/**
 * @Author: ESy
 * @Date: 2020/5/24 21:21
 */
public class test {
    public static void main(String[] args) {

        DoubleCheckSingleton.getInstance().show();
        EhanSingleton.getInstance().show();
        EnumSingleton.INSTANCE.show();
        LhanSingleton.getInstance().show();
        StaticSingleton.getInstance().show();




    }


}
