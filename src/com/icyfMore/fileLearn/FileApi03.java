package com.icyfMore.fileLearn;

import java.io.File;
import java.io.IOException;

/**
 * @Author: ESy
 * @Date: 2020/5/28 15:55
 * 删除功能
 * boolean delete()
 * 删除由此抽象路径名表示的文件或目录。
 */
public class FileApi03 {
    public static void main(String[] args) {
        //文件
        File f1 = new File("F:\\file\\b.txt");

        try {
            //创建b.txt
            System.out.println(f1.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(f1.delete());

        //目录
        File f2 = new File("F:\\file\\moreDir");
        //.delete() 无法删除 包含其他文件或目录 的目录
        System.out.println(f2.delete()); //false


    }
}
