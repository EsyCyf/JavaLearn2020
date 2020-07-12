package com.icyfMore.diGuiRecursion;

import java.io.File;

/**
 * @Author: ESy
 * @Date: 2020/5/28 16:34
 * 用递归返回指定目录下的所有文件的路径
 */
public class RecursionFile {

    public static void main(String[] args) {
        File f1 = new File("F:\\file");
        getAllFilePath(f1);

        //F:\file\a.txt
        //F:\file\c.txt
        //F:\file\newDir\newFile.txt
        //F:\file\newFile.txt

    }



    public static void getAllFilePath(File file){
        //获取指定目录下所有文件和目录的File数组
        File[] files = file.listFiles();
        //判断数组是否为空
        if (files!=null){
            //遍历数组
            for (File f : files){
                //判断该File对象时候为目录
                if (f.isDirectory()){
                    //是则递归调用函数
                    getAllFilePath(f);
                }else {
                    //否则输出path
                    System.out.println(f.getPath());
                }
            }
        }
    }
}
