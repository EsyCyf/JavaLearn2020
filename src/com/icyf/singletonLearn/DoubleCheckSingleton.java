package com.icyf.singletonLearn;

/**
 * @Author: ESy
 * @Date: 2020/5/24 21:26
 * 线程安全，延迟初始化。这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * 双重检查模式，进行了两次的判断
 * 第一次是为了避免不要的实例
 * 第二次是为了进行同步，避免多线程问题。
 * 由于singleton=new Singleton()对象的创建在JVM中可能会进行重排序，
 * 在多线程访问下存在风险，使用volatile修饰signleton实例变量有效，解决该问题。
 */
public class DoubleCheckSingleton {
    private static volatile DoubleCheckSingleton instance;
    private DoubleCheckSingleton(){}
    public static DoubleCheckSingleton getInstance(){
        if (instance == null){
            synchronized (DoubleCheckSingleton.class){
                if (instance == null){
                    instance = new DoubleCheckSingleton();
                }
            }
        }

        return instance;
    }

    public void show(){
        System.out.println("这是DoubleCheckSingleton类");
    }
}
