package com.icyfMore.charStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: ESy
 * @Date: 2020/5/29 14:25
 * copy优化
 * 1、简化书写 使用子类FileReader FileWriter替换父类InputStreamReader OutputStreamWriter
 *   public class FileReader extends InputStreamReader
 *   FileReader(String fileName)
 *   创建一个新的 FileReader ，给定要读取的文件的名称
 *
 *   public class FileWriter extends OutputStreamWriter
 *   FileWriter(String fileName)
 *   构造一个给定文件名的FileWriter对象。
 *   FileWriter(String fileName, boolean append)
 *   构造一个FileWriter对象，给出一个带有布尔值的文件名，表示是否附加写入的数据。
 */
public class CopyDemo02 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("F:\\file\\a.txt");
        FileWriter fw = new FileWriter("file\\copyBetter.txt");

        int len;
        char[] chars = new char[1024];
        while((len = fr.read(chars))!=-1){
            fw.write(chars,0,len);
        }


        fr.close();
        fw.close();
    }
}
