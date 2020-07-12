package com.icyfMoremore.producerAndConsumer;

/**
 * @Author: ESy
 * @Date: 2020/6/1 16:03
 */
public class Producer implements Runnable {
    private Box b;

    public Producer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            b.put(i);
        }
    }
}
