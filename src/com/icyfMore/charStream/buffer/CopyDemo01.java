package com.icyfMore.charStream.buffer;

import java.io.*;

/**
 * @Author: ESy
 * @Date: 2020/5/29 14:46
 * 字符缓冲流复制
 */
public class CopyDemo01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("F:\\file\\a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("file\\bufferedCopy"));

        int len;
        char[] chars = new char[1024];
        while ((len = br.read(chars))!=-1){
            bw.write(chars,0,len);
        }


        br.close();
        bw.close();
    }
}
