package com.icyfMore.charStream.buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author: ESy
 * @Date: 2020/5/29 14:35
 *
 * BufferedReader(Reader in)
 * 创建使用默认大小的输入缓冲区的缓冲字符输入流。
 * BufferedReader(Reader in, int sz)
 * 创建使用指定大小的输入缓冲区的缓冲字符输入流。
 */
public class BufferReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("file\\bufferedWriter.txt"));

        int len;
        char[] chars = new char[1024];
        while((len=br.read(chars))!=-1){
            System.out.print(chars);
        }


        br.close();
    }
}
