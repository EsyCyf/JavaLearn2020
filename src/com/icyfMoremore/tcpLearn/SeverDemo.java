package com.icyfMoremore.tcpLearn;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: ESy
 * @Date: 2020/6/1 20:08
 *
 * TCP接受数据
 *
 * ServerSocket(int port)
 * 创建绑定到指定端口的服务器套接字。
 *
 * Socket accept()
 * 侦听要连接到此套接字并接受它。
 *
 */
public class SeverDemo {
    public static void main(String[] args) throws IOException {
        //ServerSocket(int port)
        ServerSocket ss = new ServerSocket(10000);

        //Socket accept()监听连接并获取Socket对象
        Socket s = ss.accept();

        InputStream is = s.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println("数据是："+new String(bytes,0,len));


        //释放资源
        s.close();
        ss.close();
    }

}
