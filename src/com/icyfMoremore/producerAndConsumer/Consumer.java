package com.icyfMoremore.producerAndConsumer;

/**
 * @Author: ESy
 * @Date: 2020/6/1 16:03
 */
public class Consumer implements Runnable {
    private Box b;

    public Consumer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        while (true) b.get();
    }
}
