package com.icyfMore.byteStream.inAndOutputStreaming;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: ESy
 * @Date: 2020/5/28 17:28
 * 输入的3种方式
 * void write(byte[] b)
 * 将 b.length个字节从指定的字节数组写入此文件输出流。
 * void write(byte[] b, int off, int len)
 * 将 len字节从位于偏移量 off的指定字节数组写入此文件输出流。
 * void write(int b)
 * 将指定的字节写入此文件输出流。
 */
public class FileOutDemo02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("file\\a.txt");

        //void write(int b)
//        fos.write(97);


        //void write(byte[] b)
//        byte[] bytes = {97,98,99};
//        fos.write(bytes);
//        fos.write("abc".getBytes());


        //void write(byte[] b, int off, int len)
        //从索引i 开始 写ii个
        byte[] bytes ="abc".getBytes();
        fos.write(bytes,0, bytes.length); //abc
        fos.write(bytes,1, bytes.length-1); //bc






        fos.close();
    }
}
