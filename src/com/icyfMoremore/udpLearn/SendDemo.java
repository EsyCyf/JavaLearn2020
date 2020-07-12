package com.icyfMoremore.udpLearn;

import java.io.IOException;
import java.net.*;

/**
 * @Author: ESy
 * @Date: 2020/6/1 16:58
 *
 * public class DatagramSocket
 * extends Object
 * implements Closeable
 *
 * DatagramSocket()
 * 构造数据报套接字并将其绑定到本地主机上的任何可用端口。
 *
 * void send(DatagramPacket p)
 * 从此套接字发送数据报包。
 *          public final class DatagramPacket extends Object该类表示数据报包。
 *          DatagramPacket(byte[] buf, int length, InetAddress address, int port)
 *          构造用于发送长度的分组的数据报包 length指定主机上到指定的端口号。
 *
 * void close()
 * 关闭此数据报套接字。
 *
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端的DatagramSocket对象
        DatagramSocket ds = new DatagramSocket();

        //创建数据，并把数据打包
        //DatagramPacket(byte[] buf, int length, InetAddress address, int port)
        byte[] bytes = "HELLO UDP，我来了".getBytes();
//        int length = bytes.length;
//        InetAddress address = InetAddress.getByName("MSI");
//        int port = 10086; //0~65535
//        DatagramPacket dp = new DatagramPacket(bytes, length, address, port);
        DatagramPacket dp = new DatagramPacket(bytes,
                bytes.length,
                InetAddress.getByName("MSI"),
                10086);

        //调用DatagramSocket对象的方法发送数据 void send(DatagramPacket p)
        ds.send(dp);
        //关闭发送源
        ds.close();
    }
}
