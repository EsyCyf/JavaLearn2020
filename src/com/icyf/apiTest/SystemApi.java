package com.icyf.apiTest;

/**
 * @Author: ESy
 * @Date: 2020/5/26 17:04
 */
public class SystemApi {
    public static void main(String[] args) {
//        System.exit(0); //终止当前运行的Java虚拟机。

//        System.currentTimeMillis(); //它返回的是1970年1月1日0点到现在经过的毫秒数

//        System.out.println("从1970年1月1日0点，经过了"+(System.currentTimeMillis()*1.0/1000/60/60/24/365)+"年");
        //从1970年1月1日0点，经过了50.43393636333081年



        long begin = System.currentTimeMillis();

        for (int i = 0;i<10000;i++){
            System.out.println(i);
        }

        long end = System.currentTimeMillis();
        System.out.println("经过了"+(end-begin)+"毫秒"); //经过了97毫秒
    }
}
