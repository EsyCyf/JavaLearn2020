package com.icyfMore.propertiesLearn;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author: ESy
 * @Date: 2020/5/30 15:45
 *
 * Properties和IO流结合的方法
 *
 * void load(InputStream inStream)
 * 从输入字节流读取属性列表（键和元素对）。
 * void load(Reader reader)
 * 以简单的线性格式从输入字符流读取属性列表（关键字和元素对）。
 *
 * store(OutputStream out, String comments)
 * 将此属性列表（键和元素对）写入此 Properties表中，以适合于使用 load(InputStream)方法加载到 Properties表中的格式输出流。
 * void store(Writer writer, String comments)
 * 将此属性列表（键和元素对）写入此 Properties表中，以适合使用 load(Reader)方法的格式输出到输出字符流
 *
 *
 *
 */
public class PropertiesDemo03 {
    public static void main(String[] args) throws IOException {
        //把集合中的数据保存到文件
//        myStore();
        //#Sat May 30 15:51:37 CST 2020
        //4=呜呜呜呜
        //3=嘻嘻嘻嘻
        //2=呵呵呵呵呵
        //1=啊哈哈哈哈

        //把文件中的数据加载到集合
        myLoad();
        //{4=呜呜呜呜, 3=嘻嘻嘻嘻, 2=呵呵呵呵呵, 1=啊哈哈哈哈}

    }




    private static void myStore() throws IOException {
        Properties prop = new Properties();

        prop.setProperty("1","啊哈哈哈哈");
        prop.setProperty("2","呵呵呵呵呵");
        prop.setProperty("3","嘻嘻嘻嘻");
        prop.setProperty("4","呜呜呜呜");

        FileWriter fw = new FileWriter("ser\\prop.txt");
        prop.store(fw,null);


        fw.close();
    }


    private static void myLoad() throws IOException{
        Properties prop = new Properties();

        FileReader fr = new FileReader("ser\\prop.txt");
        prop.load(fr);

        fr.close();
        System.out.println(prop);
    }
}
