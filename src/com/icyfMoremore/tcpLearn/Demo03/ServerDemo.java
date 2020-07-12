package com.icyfMoremore.tcpLearn.Demo03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: ESy
 * @Date: 2020/6/1 21:36
 * 接受数据存入文本文件中 给出反馈
 */
public class ServerDemo {
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

        //给出反馈
        BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwServer.write("文件上传成功");
        bwServer.flush();


        bwServer.close();
        bw.close();
        ss.close();
    }
}
