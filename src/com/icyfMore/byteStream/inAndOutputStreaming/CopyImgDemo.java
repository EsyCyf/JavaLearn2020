package com.icyfMore.byteStream.inAndOutputStreaming;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: ESy
 * @Date: 2020/5/28 20:08
 * 将 F:\file\girl.jpg 复制到file\ 中
 */
public class CopyImgDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\file\\girl.jpg");
        FileOutputStream fos = new FileOutputStream("file\\girl.jpg");

        byte[] bytes = new byte[1024];
        int len;
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }


        fis.close();
        fos.close();
    }
}
