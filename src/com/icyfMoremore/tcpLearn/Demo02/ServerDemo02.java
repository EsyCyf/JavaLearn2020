package com.icyfMoremore.tcpLearn.Demo02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: ESy
 * @Date: 2020/6/1 21:37
 * 接受数据存入文本文件中
 */
public class ServerDemo02 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);

        Socket s = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new FileWriter("ser\\server.txt"));

        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }


        bw.close();
        ss.close();
    }
}
