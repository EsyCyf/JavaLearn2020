package com.icyfMore.charStream;

import java.io.*;

/**
 * @Author: ESy
 * @Date: 2020/5/29 14:19
 * 复制文件
 */
public class CopyDemo01 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("F:\\file\\a.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("file\\aCopy.txt"));

        int len;
        char[] chars = new char[1024];
        while ((len = isr.read(chars))!=-1){
            osw.write(chars,0,len);
        }





        isr.close();
        osw.close();
    }
}
