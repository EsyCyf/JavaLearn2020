package com.icyfMore.charStream.printWriter;

import java.io.*;

/**
 * @Author: ESy
 * @Date: 2020/5/29 17:42
 * 使用打印流 进行改进
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("file//a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("file//printCopy.txt"));
//        PrintWriter pw = new PrintWriter(new FileWriter("file//printCopy.txt");
        PrintWriter pw = new PrintWriter(bw, true); //自动flush


        String line;
        while ((line=br.readLine())!=null){
            pw.println(line);
        }



        br.close();
        bw.close();
    }
}
