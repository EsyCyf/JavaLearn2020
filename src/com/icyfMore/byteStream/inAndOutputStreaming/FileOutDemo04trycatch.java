package com.icyfMore.byteStream.inAndOutputStreaming;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: ESy
 * @Date: 2020/5/28 17:49
 * 异常处理
 */
public class FileOutDemo04trycatch {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("file\\a.txt");
            fos.write("hello".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
