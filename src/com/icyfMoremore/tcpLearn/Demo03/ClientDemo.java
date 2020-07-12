package com.icyfMoremore.tcpLearn.Demo03;

import java.io.*;
import java.net.Socket;

/**
 * @Author: ESy
 * @Date: 2020/6/1 21:36
 * 数据来自文本，接受服务器反馈
 * void shutdownInput()
 * 将此套接字的输入流放置在“流的末尾”。
 * void shutdownOutput()
 * 禁用此套接字的输出流。
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("MSI", 10000);

        //封装文本文件的数据
        BufferedReader br = new BufferedReader(new FileReader("ser\\client.txt"));
        //封装输出流写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.shutdownOutput();

        BufferedReader brClinet = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = brClinet.readLine();
        System.out.println("服务器反馈："+data);


        br.close();
        s.close();
    }
}
