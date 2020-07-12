package com.icyfMore.byteStream.inAndOutputStreaming;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author: ESy
 * @Date: 2020/5/28 17:56
 * FileInputStream(File file)
 * 通过打开与实际文件的连接创建一个 FileInputStream ，该文件由文件系统中的 File对象 file命名。
 * FileInputStream(FileDescriptor fdObj)
 * 创建 FileInputStream通过使用文件描述符 fdObj ，其表示在文件系统中的现有连接到一个实际的文件。
 * FileInputStream(String name)
 * 通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系统中的路径名 name命名。
 */
public class FileInDemo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("file\\a.txt");

        //int read()
        //从该输入流读取一个字节的数据。数据的下一个字节，如果达到文件的末尾则返回-1。
//        int read1 = fis.read();
//        System.out.println(read1); //104
//        read1 = fis.read();
//        System.out.println((char)read1); //e
        //while循环
        int read = 0;
        while (read!=-1){
            read = fis.read();
            System.out.print((char)read);
        }

        //int read(byte[] b)
        //从该输入流读取最多 b.length个字节的数据为字节数组。



        fis.close();

    }
}
