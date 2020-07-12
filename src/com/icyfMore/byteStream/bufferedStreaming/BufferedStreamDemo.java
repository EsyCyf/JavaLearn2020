package com.icyfMore.byteStream.bufferedStreaming;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: ESy
 * @Date: 2020/5/28 20:20
 * BufferedOutputStream
 * 该类实现缓冲输出流。 通过设置这样的输出流，应用程序可以向底层输出流写入字节，而不必为写入的每个字节导致底层系统的调用。
 * BufferedOutputStream(OutputStream out)
 * 创建一个新的缓冲输出流，以将数据写入指定的底层输出流。
 * BufferedOutputStream(OutputStream out, int size)
 * 创建一个新的缓冲输出流，以便以指定的缓冲区大小将数据写入指定的底层输出流。
 *
 * BufferedInputStream
 * BufferedInputStream为另一个输入流添加了功能，即缓冲输入和支持mark和reset方法的功能。
 * 当创建BufferedInputStream时，将创建一个内部缓冲区数组。
 * 当从流中读取或跳过字节时，内部缓冲区将根据需要从所包含的输入流中重新填充，一次有多个字节。
 * mark操作会记住输入流中的一点，并且reset操作会导致从最近的mark操作之后读取的所有字节在从包含的输入流中取出新的字节之前重新读取。
 * BufferedInputStream(InputStream in)
 * 创建一个 BufferedInputStream并保存其参数，输入流 in ，供以后使用。
 * BufferedInputStream(InputStream in, int size)
 * 创建 BufferedInputStream具有指定缓冲区大小，并保存其参数，输入流 in ，供以后使用。
 *
 */
public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("file\\buffer.txt"));










        bos.close();
    }
}
