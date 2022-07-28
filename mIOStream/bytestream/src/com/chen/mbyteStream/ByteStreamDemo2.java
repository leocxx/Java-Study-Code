package com.chen.mbyteStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*字节流写数据*/
public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("bytestream\\a.txt");
        //一次写一个数据
        //method1(fos);
        //一次写入多个数据
        //method2(fos);
        //一次写一个字节数组的一部分
        //method3(fos);

    }

    private static void method3(FileOutputStream fos) throws IOException {
        byte [] srr = {97,98,99,99,99,99,99,99,99,99};
        fos.write(srr,1,2);
        fos.close();
    }

    private static void method2(FileOutputStream fos) throws IOException {
        byte [] srr = {97,98,99};
        fos.write(srr);
        fos.close();
    }

    private static void method1(FileOutputStream fos) throws IOException {

        fos.write(97);
        fos.write(98);
        fos.write(99);

        fos.close();
    }
}
