package com.icyfMoremore.tcpLearn.Demo01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: ESy
 * @Date: 2020/6/1 20:23
 *
 * 服务器端 接受数据 给出反馈
 *
 */
public class SeverDemo {
    public static void main(String[] args) throws IOException {
        //ServerSocket(int port)
        ServerSocket ss = new ServerSocket(10000);

        //Socket accept()监听连接并获取Socket对象
        Socket s = ss.accept();

        //接受数据
        InputStream is = s.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println("数据是："+new String(bytes,0,len));

        //给出反馈
        OutputStream os = s.getOutputStream();
        os.write("收到!".getBytes());


        //释放资源
        ss.close();
    }
}
