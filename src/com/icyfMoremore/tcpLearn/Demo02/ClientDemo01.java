package com.icyfMoremore.tcpLearn.Demo02;

import java.io.*;
import java.net.Socket;

/**
 * @Author: ESy
 * @Date: 2020/6/1 21:25
 *
 * 键盘录入数据 输入886结束
 */
public class ClientDemo01 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("MSI", 10000);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //封装输出流对象
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line=br.readLine())!=null){
//            OutputStream os = s.getOutputStream();
            bw.write(line);
            bw.newLine();
            bw.flush();

            if (line.equals("886")){
                break;
            }
        }


        s.close();
    }
}
