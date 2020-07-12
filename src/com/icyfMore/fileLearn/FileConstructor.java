package com.icyfMore.fileLearn;

import jdk.nashorn.internal.objects.annotations.Constructor;

import java.io.File;

/**
 * @Author: ESy
 * @Date: 2020/5/28 15:23
 * File三种构造方法
 */
public class FileConstructor {
    public static void main(String[] args) {

        //File(String pathname)
        //通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
        File f1 = new File("F:\\file\\a.txt");
        System.out.println(f1);

        //File(String parent, String child)
        //从父路径名字符串和子路径名字符串创建新的 File实例。
        File f2 = new File("F:\\file","a.txt");
        System.out.println(f2);

        //File(File parent, String child)
        //从父抽象路径名和子路径名字符串创建新的 File实例。
        //File(URI uri)
        //通过将给定的 file: URI转换为抽象路径名来创建新的 File实例。
        File f3 = new File("F:\\file");
        File f4 = new File(f3,"a.txt");
        System.out.println(f4);

        //F:\file\a.txt

    }
}
