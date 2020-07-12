package com.icyfMore.byteStream.inAndOutputStreaming;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author: ESy
 * @Date: 2020/5/28 18:34
 * int read(byte[] b)
 * 从该输入流读取最多 b.length个字节的数据为字节数组。
 * 返回 读入缓冲区的总字节数，如果没有更多的数据，因为文件的结尾已经到达， -1 。
 */
public class FileInDemo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("file\\a.txt");

        byte[] bytes = new byte[5];

        //第一次读取
        int len = fis.read(bytes);
        System.out.println(len); //5
        //String(byte[] bytes)
        //通过使用平台的默认字符集解码指定的字节数组来构造新的 String 。
        //String(byte[] bytes, int offset, int length)
        //通过使用平台的默认字符集解码指定的字节子阵列来构造新的 String 。
        System.out.println(new String(bytes,0,len)); //hello

        //第二次读取
        len = fis.read(bytes);
        System.out.println(len); //5
        System.out.println(new String(bytes,0,len)); // plea

        //第三次读取
        len = fis.read(bytes);
        System.out.println(len); //4
        System.out.println(new String(bytes,0,len)); // se\r\n
        //第四次读取
        len = fis.read(bytes);
        System.out.println(len); //-1 说明已经到达末尾

    }
}
