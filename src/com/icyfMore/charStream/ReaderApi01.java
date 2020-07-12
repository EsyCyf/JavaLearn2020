package com.icyfMore.charStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: ESy
 * @Date: 2020/5/29 14:12
 *
 * InputStreamReader(InputStream in)
 * 创建一个使用默认字符集的InputStreamReader。
 * InputStreamReader(InputStream in, Charset cs)
 * 创建一个使用给定字符集的InputStreamReader。
 * InputStreamReader(InputStream in, CharsetDecoder dec)
 * 创建一个使用给定字符集解码器的InputStreamReader。
 * InputStreamReader(InputStream in, String charsetName)
 * 创建一个使用命名字符集的InputStreamReader。
 *
 * int read()
 * 读一个字符
 * int read(char[] cbuf, int offset, int length)
 * 将字符读入数组的一部分。
 * boolean ready()
 * 告诉这个流是否准备好被读取。
 */
public class ReaderApi01 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("file\\isr.txt"));


        //一次读一个字符
//        int read ;
//        while((read= isr.read())!=-1){
//            System.out.print((char)read);
//        }

        //一次读一个数组
        int read;
        char[] chars = new char[1024];
        while ((read = isr.read(chars))!=-1){
            System.out.print(chars);
        }


        isr.close();
    }
}
