package com.chen.mbyteStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
*   换行和追加写入
* */
public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //追加写入，在位置后加入true就相当于打开了续写开关
        FileOutputStream fos = new FileOutputStream("bytestream\\a.txt",true);
        fos.write("\r\n".getBytes());
        fos.write(97);
        fos.write("\r\n".getBytes());
        fos.write(98);
        fos.write("\r\n".getBytes());
        fos.write(99);
        fos.write("\r\n".getBytes());
        fos.write(100);

        fos.close();
    }
}
