package com.icyfMoremore.tcpLearn.Demo01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author: ESy
 * @Date: 2020/6/1 20:23
 *
 * 客户端 发送数据 接受服务器端反馈
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.1.3", 10000);

        //获取输出流
        OutputStream os = socket.getOutputStream();
        os.write("hello,tcp,洗内！".getBytes());

        //接受服务器反馈
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println("客户端："+new String(bytes,0,bytes.length));

        //释放资源
        socket.close();
    }
}
