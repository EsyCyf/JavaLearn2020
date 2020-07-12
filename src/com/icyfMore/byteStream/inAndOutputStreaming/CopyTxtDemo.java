package com.icyfMore.byteStream.inAndOutputStreaming;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: ESy
 * @Date: 2020/5/28 18:26
 * 将 F:\file\a.txt里的内容 复制到file\copy.txt 中
 */
public class CopyTxtDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\file\\a.txt");
        FileOutputStream fos = new FileOutputStream("file\\copy.txt");


        int read;
        while ((read = fis.read())!=-1){
            fos.write(read);
        }


        fis.close();
        fos.close();

    }
}
