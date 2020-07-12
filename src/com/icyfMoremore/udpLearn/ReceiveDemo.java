package com.icyfMoremore.udpLearn;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @Author: ESy
 * @Date: 2020/6/1 17:15
 * DatagramSocket(int port)
 * 构造数据报套接字并将其绑定到本地主机上的指定端口。
 *
 * byte[] getData()
 * 返回数据缓冲区。
 * int getLength()
 * 返回要发送的数据的长度或接收到的数据的长度。
 */
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);

        //创建一个数据包，用于接受数据
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        //接受数据，数据存入缓冲区DatagramPacket
        ds.receive(dp);

        //解析数据
        byte[] data = dp.getData();
        //接收到的数据长度
        int length = dp.getLength();

//        String dataString = new String(data);
        String dataString = new String(data,0,length);
        System.out.println("数据是"+dataString);

        //关闭发送端
        ds.close();

    }
}
