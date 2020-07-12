package com.icyfMore.byteStream.inAndOutputStreaming;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author: ESy
 * @Date: 2020/5/28 19:44
 * 循环遍历 int read(byte[] b)
 */
public class FileInDemo03 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("file\\copy.txt")
                ;
        byte[] bytes = new byte[1024]; //默认一般设为1024及其整数倍
        int len;

        while ((len = fis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }



        fis.close();
    }
}
