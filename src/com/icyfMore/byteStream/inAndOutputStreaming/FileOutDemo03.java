package com.icyfMore.byteStream.inAndOutputStreaming;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: ESy
 * @Date: 2020/5/28 17:41
 * 字节流写数据
 *  1、如何换行？
 *      windows: \r\n
 *      linux: \n
 *      mac: \r
 *  2、如何实现追加？
 *      FileOutputStream(File file, boolean append)
 *      创建文件输出流以写入由指定的File对象表示的文件。
 *      如果第二个参数是true ，则字节将被写入文件的末尾而不是开头。
 */
public class FileOutDemo03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("file\\a.txt",true);


        //写10个hello
        for (int i = 0 ;i<=10;i++){
            fos.write(("hello"+i+"\r\n").getBytes());
        }




        fos.close();
    }
}
