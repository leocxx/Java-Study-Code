package com.chen.inputSream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FastCopyDemo {
    public static void main(String[] args) throws IOException {
        /*提高拷贝速度*/
        //创建字节输入流准备读数据
        FileInputStream fis = new FileInputStream("D:\\xxxxxchen\\test.mp4");
        //创建字节输出流准备写数据
        FileOutputStream fos = new FileOutputStream("bytestream\\test.mp4");

        byte[] bytes = new byte[1024];
        int len;    // --------表示这次读到了多少
        while ((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }
        fis.close();
        fos.close();
    }
}
