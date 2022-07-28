package com.chen.inputSream;

import java.io.*;

public class bufferDemo {
    public static void main(String[] args) throws IOException {
        /*利用缓冲流来进行拷贝文件*/
        //创建一个字节缓冲输入流
        BufferedInputStream fis = new BufferedInputStream(new FileInputStream("bytestream\\test.mp4"));
        //创建一个字节缓冲输出流
        BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("bytestream\\test2.mp4"));

        int b;
        while ((b=fis.read()) != -1 ){
            fos.write(b);
        }
        fis.close();
        fos.close();
    }
}
