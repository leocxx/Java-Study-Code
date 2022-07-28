package com.chen.inputSream;

import java.io.FileInputStream;
import java.io.IOException;

public class InPutDemo2 {
    public static void main(String[] args) throws IOException {
        /*读取多个数据*/
        FileInputStream fis = new FileInputStream("bytestream\\a.txt");

        int b;
        while ((b = fis.read()) != -1) {
            System.out.println((char) b);
        }
        fis.close();
    }
}
