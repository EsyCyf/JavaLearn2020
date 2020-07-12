package com.icyfMore.charStream.buffer;

import java.io.*;

/**
 * @Author: ESy
 * @Date: 2020/5/29 14:51
 *
 * BufferedReader:
 * String readLine()
 * 读一行文字。
 * 包含行的内容的字符串，不包括任何行终止字符，如果已达到流的末尾，则为null
 *
 * BufferedWriter
 * void newLine()
 * 写一行行分隔符。
 */
public class BufferApi01 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("file\\bufferNewline.txt"));
        BufferedReader br = new BufferedReader(new FileReader("file\\bufferReadNewline.txt"));


        //写数据，换行
        for (int i = 0;i<10;i++){
            bw.write("hello");
            bw.newLine(); //换行
        }

        //读数据，换行
        String line ;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }



        br.close();
        bw.close();
    }
}
