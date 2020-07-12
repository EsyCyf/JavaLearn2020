package com.icyfMore.fileLearn;

import java.io.File;
import java.io.IOException;

/**
 * @Author: ESy
 * @Date: 2020/5/28 15:30
 * 创建文件以及目录
 */
public class FileApi01 {
    public static void main(String[] args) throws IOException {
        //创建文件.createNewFile()
        //文件不存在则创建，返回true   文件存在则不创建，返回false
        File f1 = new File("F:\\file\\newFile.txt");
        System.out.println(f1.createNewFile());

        //创建目录.mkdir()
        //无则创 返回true   有则不创 返回false
        File f2 = new File("F:\\file\\newDir");
        System.out.println(f2.mkdir());

        //创建多级目录.mkdirs() 包括不存在的父目录
        //最终目录无则创 返回true   有则不创 返回false
        File f3 = new File("F:\\file\\moreDir01\\moreDir02\\moreDir03");
        System.out.println(f3.mkdirs());

    }
}
