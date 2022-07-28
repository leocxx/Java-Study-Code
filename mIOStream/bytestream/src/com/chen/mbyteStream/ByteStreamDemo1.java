package com.chen.mbyteStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*字节流的输出步骤*/
public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //1.创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("D:\\xxxxxchen\\2.txt");
        //2.写数据
        fos.write(97);
        //3.释放资源
        fos.close();
    }
}
