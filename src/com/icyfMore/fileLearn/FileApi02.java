package com.icyfMore.fileLearn;

import java.io.File;

/**
 * @Author: ESy
 * @Date: 2020/5/28 15:38
 * 判断和获取方法
 */
public class FileApi02 {
    public static void main(String[] args) {
        File f1 = new File("F:\\file\\a.txt");

        //是否为目录
        System.out.println(f1.isDirectory()); //false
        //是否为文件
        System.out.println(f1.isFile()); //true
        //是否存在
        System.out.println(f1.exists()); //true


        //返回绝对路径
        System.out.println(f1.getAbsoluteFile()); //F:\file\a.txt
        //返回抽象路径
        System.out.println(f1.getPath()); //F:\file\a.txt
        //返回文件或目录名
        System.out.println(f1.getName()); //a.txt

        System.out.println("=============================");


        File f2 = new File("F:\\file");

        //.list() 返回一个字符串数组，命名由此抽象路径名表示的目录中的文件和目录。
        String[] list = f2.list();
        for (String s : list) System.out.println(s);
        System.out.println("----------------------------");
        //a.txt
        //moreDir01
        //newDir
        //newFile.txt

        //.listFiles() 返回一个抽象路径名数组，表示由该抽象路径名表示的目录中的文件。
        File[] files = f2.listFiles();
        for (File f : files) System.out.println(f); //toString()  返回此抽象路径名的路径名字符串。
        //F:\file\a.txt
        //F:\file\moreDir01
        //F:\file\newDir
        //F:\file\newFile.txt
    }
}
