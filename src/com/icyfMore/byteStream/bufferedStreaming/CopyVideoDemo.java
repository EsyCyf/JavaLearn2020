package com.icyfMore.byteStream.bufferedStreaming;

import java.io.*;

/**
 * @Author: ESy
 * @Date: 2020/5/28 20:31
 * 复制视频4种方式对比
 *   1、基本字节流一次读一个字节 共耗时67158毫秒
 *   2、基本字节流一次读一个字节数组 共耗时90毫秒
 *   3、字节缓冲流一次读一个字节 共耗时354毫秒
 *   4、字节缓冲流一次读一个字节数组 共耗时21毫秒
 *   Buffered牛逼！
 */
public class CopyVideoDemo {
    public static void main(String[] args) throws IOException {
        //记录开始时间
        long begin = System.currentTimeMillis();


        //执行方法
//        method1(); //共耗时67158毫秒
//        method2(); //共耗时90毫秒
//        method3(); //共耗时354毫秒
//        method4(); //共耗时21毫秒



        //记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("共耗时"+(end-begin)+"毫秒");
    }







    //基本字节流一次读一个字节
    public static void method1() throws IOException {
        FileInputStream fis = new FileInputStream("F:\\file\\xiaob.mp4");
        FileOutputStream fos = new FileOutputStream("file\\xiaob1.mp4");

        int read ;
        while ((read = fis.read())!=-1){
            fos.write(read);
        }


        fis.close();
        fos.close();
    }

    //基本字节流一次读一个字节数组
    public static void method2() throws IOException {
        FileInputStream fis = new FileInputStream("F:\\file\\xiaob.mp4");
        FileOutputStream fos = new FileOutputStream("file\\xiaob2.mp4");

        byte[] bytes = new byte[1024];
        int len;
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }


        fis.close();
        fos.close();
    }

    //字节缓冲流一次读一个字节
    public static void method3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\file\\xiaob.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("file\\xiaob3.mp4"));

        int read ;
        while ((read = bis.read())!=-1){
            bos.write(read);
        }


        bis.close();
        bos.close();
    }

    //字节缓冲流一次读一个字节数组
    public static void method4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\file\\xiaob.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("file\\xiaob4.mp4"));

        byte[] bytes = new byte[1024];
        int len;
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }

        bis.close();
        bos.close();
    }
}
