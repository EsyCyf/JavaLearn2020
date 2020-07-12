package com.icyfMoremore.tcpLearn;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Author: ESy
 * @Date: 2020/6/1 20:01
 *
 * TCP发送数据
 *
 * Socket(InetAddress address, int port)
 * 创建流套接字并将其连接到指定IP地址的指定端口号。
 *
 * Socket(String host, int port)
 * 创建流套接字并将其连接到指定主机上的指定端口号。
 *
 * OutputStream getOutputStream()
 * 返回此套接字的输出流。
 *
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象
//        Socket socket = new Socket(InetAddress.getByName("MSI"), 10000);
        Socket socket = new Socket("192.168.1.3", 10000);

        //获取输出流
        OutputStream os = socket.getOutputStream();
        os.write("hello,tcp,洗内！".getBytes());

        //释放资源
        socket.close();
    }
}
