package com.chen.inputSream;

import java.io.FileInputStream;
import java.io.IOException;

public class InPutDemo1 {
    public static void main(String[] args) throws IOException {
        //1,创建字节输入流对象
        FileInputStream fis = new FileInputStream("bytestream\\a.txt");
        //2,读数据
        int read = fis.read();
        System.out.println((char) read);
        //3.释放资源
        fis.close();
    }
}
