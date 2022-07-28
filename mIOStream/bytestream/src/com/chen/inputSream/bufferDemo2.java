package com.chen.inputSream;

import java.io.*;

public class bufferDemo2 {
    public static void main(String[] args) throws IOException {
        /*缓冲流结合数组*/
        BufferedInputStream fis = new BufferedInputStream(new FileInputStream("bytestream\\test.mp4"));
        BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("bytestream\\test2.mp4"));

        byte [] bytes = new byte[1024];
        int len;
        while ((len=fis.read(bytes))!= -1){
            fos.write(bytes,0,len);
        }
        fis.close();
        fos.close();
    }
}
