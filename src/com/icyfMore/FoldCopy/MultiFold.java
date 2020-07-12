package com.icyfMore.FoldCopy;

import java.io.*;

/**
 * @Author: ESy
 * @Date: 2020/5/29 16:22
 * 复制多级文件夹
 */
public class MultiFold {
    public static void main(String[] args) throws IOException {
        File srcFold = new File("F:\\file");
        File destFold = new File("fold\\multi");

        copyFolder(srcFold,destFold);



    }

    private static void copyFolder(File srcFold, File destFold) throws IOException {
        String sname = srcFold.getName();
        //判断数据源是否为文件夹
        if (srcFold.isDirectory()){
            //是文件夹
            //目标文件夹路径加上数据源文件夹
            File newFolder = new File(destFold,sname);
            //目标路径下创建文件夹
            if (!newFolder.exists()){
                newFolder.mkdir();
            }
            //遍历数据源文件夹中的文件
            File[] files = srcFold.listFiles();
            for (File file : files){
                //遍历的文件进行递归，
                copyFolder(file,newFolder);
            }


        }else {
            //是文件 递归出口
            //目标文件路径加上数据源文件
            File newFile = new File(destFold,sname);
            //复制文件
            copyFile(srcFold,newFile);
        }
    }


    private static void copyFile(File srcFold, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFold));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bytes = new byte[1024];
        int len;
        while((len = bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }

        bis.close();
        bos.close();
    }

}
