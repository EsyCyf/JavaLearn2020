package com.icyfMore.charStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @Author: ESy
 * @Date: 2020/5/29 13:24
 *
 * OutputStreamWriter(OutputStream out)
 * 创建一个使用默认字符编码的OutputStreamWriter。
 * OutputStreamWriter(OutputStream out, Charset cs)
 * 创建一个使用给定字符集的OutputStreamWriter。
 * OutputStreamWriter(OutputStream out, CharsetEncoder enc)
 * 创建一个使用给定字符集编码器的OutputStreamWriter。
 * OutputStreamWriter(OutputStream out, String charsetName)
 * 创建一个使用命名字符集的OutputStreamWriter。
 *
 * void write(char[] cbuf, int off, int len)
 * 写入字符数组的一部分。
 * void write(int c)
 * 写一个字符
 * void write(String str, int off, int len)
 * 写一个字符串的一部分。
 *
 * void flush()
 * 刷新流。
 */
public class WriterApi01 {
    public static void main(String[] args) throws IOException {
        //OutputStreamWriter(OutputStream out)
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("file\\osw.txt"));


        //写入一个字符
//        osw.write(97);
        //写入一个字符数组
//        osw.write(new char[]{'h','e','l','l','o'}); //hello
        //写入一个字符数组的一部分
//        char[] c1 = {'h','e','l','l','o'};
//        osw.write(c1,0,c1.length-2); //hel
        //写入一个字符串
        osw.write("abcde"); //abcde
        //写入一个字符串的一部分
//        osw.write("abcde",0,"abcde".length()-2); //abc










        //如果没有.close()释放资源，同时也无.flush()刷新流，数据无法被写入
        //flush刷新缓冲，刷新完可以继续写入数据
        //而close后不能再写入
//        osw.flush();

        //void close()
        //关闭流，先刷新。
        osw.close();
    }
}
