package com.icyfMore.charStream.arrayListAndTxt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @Author: ESy
 * @Date: 2020/5/29 15:19
 * 把文本文件中的数据读取到集合中，并遍历集合
 */
public class txtToArrayList {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("file\\arr.txt"));
        ArrayList<String> arr = new ArrayList<>();

        String line;
        while ((line = br.readLine())!=null){
            arr.add(line);
        }

        for (String s : arr){
            System.out.println(s);
        }




        br.close();
    }
}
