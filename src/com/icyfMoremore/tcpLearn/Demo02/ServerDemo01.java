package com.icyfMoremore.tcpLearn.Demo02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: ESy
 * @Date: 2020/6/1 21:25
 * 接受数据输出在控制台
 */
public class ServerDemo01 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);

        Socket s = ss.accept();

        //
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }


        ss.close();
    }
}
