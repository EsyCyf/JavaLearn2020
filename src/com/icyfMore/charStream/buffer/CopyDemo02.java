package com.icyfMore.charStream.buffer;

import java.io.*;

/**
 * @Author: ESy
 * @Date: 2020/5/29 15:05
 * 利用Buffer中的特有方法实现复制
 * 最常用的字符缓冲流方式
 */
public class CopyDemo02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("F:\\file\\newline.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("file\\bufferCopyLine.txt"));


        String line ;
        while ((line = br.readLine())!=null){
            bw.write(line);
            bw.newLine();
        }


        br.close();
        bw.close();
    }
}
