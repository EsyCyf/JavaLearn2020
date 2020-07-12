package com.icyfMore.threadSafe.test;

/**
 * @Author: ESy
 * @Date: 2020/6/17 17:34
 * 管程法
 */
public class TestPC {
    public static void main(String[] args) {
        SynContainer container = new SynContainer();
        Produer produer = new Produer(container);
        Consumer consumer = new Consumer(container);
        new Thread(produer).start();
        new Thread(consumer).start();
    }

}

class Produer implements Runnable{
    SynContainer container;

    public Produer(SynContainer container) {
        this.container = container;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("生产了"+i+"只鸡");
            container.push(new Chicken(i));
        }
    }
}

class Consumer implements Runnable{
    SynContainer container;

    public Consumer(SynContainer container) {
        this.container = container;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("消费了"+container.pop().id+"只鸡");
        }

    }
}


class Chicken{
    int id ;

    public Chicken(int id) {
        this.id = id;
    }
}

class SynContainer{
    //容器大小
    Chicken[] chickens = new Chicken[10];
    int count = 0;

    //生产者放入产品
    public synchronized void push(Chicken chicken){
        //如果容器满了，就需要等待消费者消费
        if (count == chickens.length){
            //通知消费者消费
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果没有满，就需要丢入产品
        chickens[count] = chicken;
        count++;
        this.notifyAll();
    }

    public synchronized Chicken pop(){
        if (count==0){
            //等待生产者生产
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        count--;
        Chicken chicken = chickens[count];
        this.notifyAll();
        return chicken;
    }

}