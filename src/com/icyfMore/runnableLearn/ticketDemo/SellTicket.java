package com.icyfMore.runnableLearn.ticketDemo;

/**
 * @Author: ESy
 * @Date: 2020/6/1 14:33
 *
 * ①定义一个类SellTicket实现Runnable接口, 里面定义一个成员变量: private int tickets= 100;
 *  * ②在SellTicket类中重写run0方法实现卖票 ,代码步骤如下
 *  * A:判断票数大于0,就卖票,并告知是哪个窗口卖的
 *  * B:卖了票之后，总票数要减1
 *  * C:票没有了，也可能有人来问,所以这里用死循环让卖票的动作-直执行
 *
 */
public class SellTicket implements Runnable {
    private int ticket = 100;
//    private Object lock = new Object(); //锁

    @Override
    public void run() {
        while (true){
            //同步代码块，锁
//            synchronized (lock) {
            synchronized (this) {
                if (ticket > 0) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "正在出售第" + (101 - ticket) + "张票");
                    ticket--;
                } else {
                    System.out.println(Thread.currentThread().getName() + "票已售空！");
                    break;
                }


            }

        }


    }
}
