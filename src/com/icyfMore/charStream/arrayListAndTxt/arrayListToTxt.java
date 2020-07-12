package com.icyfMore.charStream.arrayListAndTxt;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @Author: ESy
 * @Date: 2020/5/29 15:15
 *
 * 将ArrayList中的字符串写入文本文件，要求每一个是字符串元素作为一行数据
 */
public class arrayListToTxt {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("hello");
        arr.add("world");
        arr.add("copy");
        arr.add("char");
        arr.add("stream");

        BufferedWriter bw = new BufferedWriter(new FileWriter("file\\arr.txt"));

        for (String s : arr){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }




        bw.close();
    }
}
