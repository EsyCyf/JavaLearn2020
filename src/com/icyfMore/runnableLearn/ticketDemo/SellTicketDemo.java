package com.icyfMore.runnableLearn.ticketDemo;

/**
 * @Author: ESy
 * @Date: 2020/6/1 14:33
 *
 * 需求:电影院目前正在上映国产片,共有100张票，而它有3个窗口卖票，请设计-个程序模拟该电影院卖票
 * 思路:
 * ①定义一个类SellTicket实现Runnable接口, 里面定义一个成员变量: private int tickets= 100;
 * ②在SellTicket类中重写run0方法实现卖票 ,代码步骤如下
 * A:判断票数大于0,就卖票,并告知是哪个窗口卖的
 * B:卖了票之后，总票数要减1
 * C:票没有了，也可能有人来问,所以这里用死循环让卖票的动作-直执行
 * ③定义一个测试类SellTicketDemo, 里面有main方法, 代码步骤如下
 * A:创建ellTicket类的对象
 * B:创建三个Thread类的对象,把SellTicket对象作为构造方法的参数,并给出对应的窗口名称
 * C:启动线程
 *
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
