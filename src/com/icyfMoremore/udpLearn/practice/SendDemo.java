package com.icyfMoremore.udpLearn.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @Author: ESy
 * @Date: 2020/6/1 18:23
 * 发送键盘录入的数据,直到输入886
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端的DatagramSocket对象
        DatagramSocket ds = new DatagramSocket();

        //自己封装键盘录入数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line ;
        System.out.println("请输入内容：");
        while ((line = br.readLine())!=null){
            //数据打包
            byte[] bytes = line.getBytes();
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("MSI"), 12345);
            //发送
            ds.send(dp);

            //输入886时，发送数据结束
            if (line.equals("886")){
                break;
            }

        }
        br.close();



    }
}
