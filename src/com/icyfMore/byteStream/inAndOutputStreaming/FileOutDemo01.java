package com.icyfMore.byteStream.inAndOutputStreaming;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: ESy
 * @Date: 2020/5/28 17:08
 * FileOutputStream是抽象类OutputStream的子类
 * FileOutputStream(File file)
 * 创建文件输出流以写入由指定的 File对象表示的文件。
 * FileOutputStream(String name)
 * 创建文件输出流以指定的名称写入文件。
 */
public class FileOutDemo01 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象D:\workspaceIII\JavaLearn2020\file\a.txt
        FileOutputStream fos = new FileOutputStream("file\\a.txt");
        //等同于 FileOutputStream fos = new FileOutputStream(new File("file\\a.txt"));
        //做了三件事：
        // 1、调用系统功能创建了文件
        // 2、创建了字节输出流对象3
        // 、让字节输出流对象指向创建好的文件

        //write(byte[] b)
        //将 b.length个字节从指定的字节数组写入此文件输出流。
        fos.write(97);

        //最后要释放资源,重要！！！！！！！！！！！！！！！！
        //.close() 关闭此文件输出流并释放与此流相关联的任何系统资源。
        fos.close();

    }
}
