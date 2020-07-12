package com.icyfMore.runnableLearn.ticketDemo02;

/**
 * @Author: ESy
 * @Date: 2020/6/1 15:05
 */
public class SellTicket implements Runnable {

    private static int ticket = 100;
    //    private Object lock = new Object(); //锁
    private int x = 0;

    @Override
    public void run() {
        while (true) {
            if (x % 2 == 0) {
                //同步代码块
//                synchronized (lock) {
                //同步方法
//                synchronized (this) {
                //同步静态方法
                synchronized (SellTicket.class) {
                    if (ticket > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println(Thread.currentThread().getName() + "正在出售第" + (101 - ticket) + "张票");
                        ticket--;

                    }

                }
            } else {

                sellTicket();
            }
            x++;

        }
    }

    //同步方法
    private  synchronized void sellTicket() {

        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "正在出售第" + (101 - ticket) + "张票");
            ticket--;
        }

    }
}
