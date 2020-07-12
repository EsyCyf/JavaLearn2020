package com.icyfMoremore.tcpLearn.Demo03;

import java.io.*;
import java.net.Socket;

/**
 * @Author: ESy
 * @Date: 2020/6/1 22:13
 */
public class ServerThread implements Runnable {
    private Socket s;
    public ServerThread(Socket s) {
        this.s = s ;
    }

    @Override
    public void run() {
        //接受数据写到文本文件
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//            BufferedWriter bw = new BufferedWriter(new FileWriter("ser\\server.txt"));
            int count = 0;
            File file = new File("ser",count+".txt");
            while (file.exists()){
                count++;
                file = new File("ser",count+".txt");
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));


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


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                s.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
