package com.icyfMoremore.tcpLearn.Demo02;

import java.io.*;
import java.net.Socket;

/**
 * @Author: ESy
 * @Date: 2020/6/1 21:51
 * 数据来自文本文件
 */
public class ClientDemo02 {
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


        br.close();
        s.close();

    }
}
