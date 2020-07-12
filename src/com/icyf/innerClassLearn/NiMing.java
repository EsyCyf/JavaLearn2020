package com.icyf.innerClassLearn;

/**
 * @Author: ESy
 * @Date: 2020/5/26 16:42
 * 匿名内部类
 */
public class NiMing {
    public void method(){
        new Inter(){

            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show(); //注意分号
    }

    public void methods(){
        Inter i = new Inter() {

            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };//注意分号
        i.show();
        i.show();
        i.show();
        i.show();
    }


}
