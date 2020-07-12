package com.icyfMoremore.udpLearn.practice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @Author: ESy
 * @Date: 2020/6/1 18:24
 */
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(12345);

        while (true){
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

            ds.receive(dp);

            System.out.println("数据是："+new String(dp.getData(),0,dp.getLength()));
        }



    }
}
