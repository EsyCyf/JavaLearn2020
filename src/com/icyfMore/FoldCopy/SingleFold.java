package com.icyfMore.FoldCopy;

import java.io.*;

/**
 * @Author: ESy
 * @Date: 2020/5/29 16:04
 * 复制单级文件夹下的所有文件
 */
public class SingleFold {
    public static void main(String[] args) throws IOException {
        //数据源文件夹
        File srcFold = new File("F:\\file\\sample");
        //数据源文件夹名
        String srcFoldName = srcFold.getName();
        //目标文件夹
        File destFold = new File("fold\\single",srcFoldName);
        //判断目标文件夹是否存在
        if (!destFold.exists()){
            destFold.mkdir();
        }

        File[] listFiles = srcFold.listFiles();
        for (File file:listFiles){
            String name = file.getName();
            File destFile = new File(destFold,name);
            copyFile(file,destFile);
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
