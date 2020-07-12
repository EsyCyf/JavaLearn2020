package com.icyfMore.charStream;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @Author: ESy
 * @Date: 2020/5/28 21:12
 * 字符串中的编码解码问题
 */
public class StringCharsetDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "中国";

        byte[] bytes = s.getBytes("UTF-8"); //[-28, -72, -83, -27, -101, -67]
        byte[] bytesUTF = s.getBytes("UTF-8"); //[-28, -72, -83, -27, -101, -67]
        byte[] bytesGBK = s.getBytes("GBK"); //[-42, -48, -71, -6]
        System.out.println(Arrays.toString(bytes));
        System.out.println(Arrays.toString(bytesUTF));
        System.out.println(Arrays.toString(bytesGBK));

        String str = new String(bytes); //中国
        String strUTF = new String(bytesUTF,"UTF-8"); //中国
        String strGBK = new String(bytesGBK,"GBK"); //中国
        String strUTFtoGBK = new String(bytesUTF,"GBK"); //涓浗
        String strGBKtoUTF = new String(bytesGBK,"UTF-8"); //�й�



        System.out.println(str);
        System.out.println(strUTF);
        System.out.println(strGBK);
        System.out.println(strUTFtoGBK);
        System.out.println(strGBKtoUTF);

    }
}
