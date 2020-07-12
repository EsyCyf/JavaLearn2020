package com.icyfMoremore.inetAddressLearn;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author: ESy
 * @Date: 2020/6/1 16:44
 *
 * public class InetAddress
 * extends Object
 * implements Serializable
 *
 * static InetAddress getByName(String host)
 * 确定主机名称的IP地址。
 * 主机名称可以是机器名称，例如“ java.sun.com ”或其IP地址的文本表示。
 *
 *
 *
 */
public class Demo {
    public static void main(String[] args) throws UnknownHostException {
//        InetAddress address = InetAddress.getByName("MSI");
        InetAddress address = InetAddress.getByName("192.168.1.3");

//        InetAddress address = InetAddress.getByName("127.0.0.1");
        //主机名127.0.0.1
        //ip地址127.0.0.1

        String name = address.getHostName();

        String ip = address.getHostAddress();

        System.out.println("主机名"+name+"\nip地址"+ip);
        //主机名MSI
        //ip地址192.168.1.3

    }
}
