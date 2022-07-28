package com.chen.inputSream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOtest {
    public static void main(String[] args) throws IOException {
        /*IO复制文件*/
        //创建字节输入流准备读数据
        FileInputStream fis = new FileInputStream("D:\\xxxxxchen\\test.mp4");
        //创建字节输出流准备写数据
        FileOutputStream fos = new FileOutputStream("bytestream\\test.mp4");

        //开始读写
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
        fis.close();
        fos.close();
    }
}
