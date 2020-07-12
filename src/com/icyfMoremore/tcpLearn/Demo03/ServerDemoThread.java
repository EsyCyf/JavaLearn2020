package com.icyfMoremore.tcpLearn.Demo03;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: ESy
 * @Date: 2020/6/1 22:09
 * 接受数据存入文本文件中 给出反馈 代码用线程进行封装 为每一个客户开启一个线程
 */
public class ServerDemoThread {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);

        while (true){
            Socket s = ss.accept();

            new Thread(new ServerThread(s)).start();
        }



    }
}
