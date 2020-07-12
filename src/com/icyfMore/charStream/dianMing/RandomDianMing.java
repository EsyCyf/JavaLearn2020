package com.icyfMore.charStream.dianMing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * @Author: ESy
 * @Date: 2020/5/29 15:25
 * 有一个文件里存储了班级同学的姓名，每一个姓名占一行，要求通过程序实现随机点名
 */
public class RandomDianMing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("file\\bufferCopyLine.txt"));
        ArrayList<String> arr = new ArrayList<>();

        String line;
        while ((line = br.readLine())!=null){
            arr.add(line);
        }

        Random random = new Random();
        System.out.println(arr.get(random.nextInt(arr.size())));


        br.close();
    }
}
