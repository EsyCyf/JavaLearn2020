package com.icyfMoremore.producerAndConsumer;

/**
 * @Author: ESy
 * @Date: 2020/6/1 16:00
 * 生产者消费者案例中包含的类:
 * ●
 * 奶箱类(Box):定义一个成员变量，表示第x瓶奶，提供存储牛奶和获取牛奶的操作
 * ●生产者类(Producer): 实现Runnable接口，重写run0方法,调用存储牛奶的操作
 * ●消费者类(Customer): 实现Runnable接口,重写run0方法，调用获取牛奶的操作
 * ●
 * 测试类(BoxDemo):里面有main方法，main方法中的代码步骤如下
 * ①创建奶箱对象，这是共享数据区域
 * ②创建生产者对象，把奶箱对象作为构造方法参数传递，因为在这个类中要调用存储牛奶的操作
 * ③创建消费者对象，把奶箱对象作为构造方法参数传递，因为在这个类中要调用获取牛奶的操作
 * ④创建2个线程对象，分别把生产者对象和消费者对象作为构造方法参数传递
 * ⑤启动线程
 */
public class BoxDemo {
    public static void main(String[] args) {
        Box b = new Box();

        Producer producer = new Producer(b);
        Consumer consumer = new Consumer(b);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);



        t1.start();
        t2.start();
    }
}
