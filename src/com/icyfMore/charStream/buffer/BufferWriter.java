package com.icyfMore.charStream.buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: ESy
 * @Date: 2020/5/29 14:37
 *
 * BufferedWriter(Writer out)
 * 创建使用默认大小的输出缓冲区的缓冲字符输出流。
 * BufferedWriter(Writer out, int sz)
 * 创建一个新的缓冲字符输出流，使用给定大小的输出缓冲区。
 *
 */
public class BufferWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("file\\bufferedWriter.txt"));



        bw.write("hello world!");


        bw.close();
    }
}
