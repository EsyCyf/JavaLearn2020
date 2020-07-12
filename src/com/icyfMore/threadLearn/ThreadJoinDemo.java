package com.icyfMore.threadLearn;

/**
 * @Author: ESy
 * @Date: 2020/5/31 23:57
 *
 * void join()
 * 等待这个线程死亡。
 * void join(long millis)
 * 等待这个线程死亡的时间最多为millis毫秒。 0的超时意味着永远等待。
 *
 *
 */
public class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadJoin mt01 = new ThreadJoin("mt01艾伦·耶格尔");
        ThreadJoin mt02 = new ThreadJoin("mt02Mikasa");
        ThreadJoin mt03 = new ThreadJoin("mt03阿尔敏");






        //启动线程
        mt01.start();
        mt01.join(10000); //当mt01线程执行完毕后，其他线程才开始执行
        mt02.start();
        mt03.start();
    }
}
