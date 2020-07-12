package com.icyfMoremore.producerAndConsumer;

/**
 * @Author: ESy
 * @Date: 2020/6/1 16:00
 *
 * 奶箱类(Box):定义一个成员变量，表示第x瓶奶，提供存储牛奶和获取牛奶的操作
 */
public class Box {
    //定义一个成员变量，表示第x瓶奶
    private int milk;
    //定义一个成员变量，表示奶箱状态
    private boolean state = false;

    //存储牛奶
    public synchronized void put(int milk){
        if (state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //没有奶则生产
        this.milk = milk;
        System.out.println("送奶工将第"+this.milk+"瓶奶放入奶箱");
        //生产完毕后，修改奶箱状态
        state=true;

        //唤醒其他等待的线程
        notifyAll();
    }

    //获取牛奶
    public synchronized void get(){
        if (!state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //如果有奶，则消费
        System.out.println("用户拿到第"+this.milk+"瓶奶");
        //消费牛奶后，修改奶箱状态
        state = false;

        //唤醒其他等待的线程
        notifyAll();
    }
}
