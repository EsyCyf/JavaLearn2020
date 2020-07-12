package com.icyfMore.runnableLearn.ticketDemo02;

/**
 * @Author: ESy
 * @Date: 2020/6/1 15:05
 */
public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket st = new SellTicket();

        Thread t1 = new Thread(st, "一号窗口");
        Thread t2 = new Thread(st, "二号窗口");
        Thread t3 = new Thread(st, "三号窗口");


        //启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}
