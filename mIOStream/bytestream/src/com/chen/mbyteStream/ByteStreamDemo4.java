package com.chen.mbyteStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*字节流写数据加异常处理*/
public class ByteStreamDemo4 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("D:\\xxxxxchen\\2.txt");
            fos.write(98);

        } catch (IOException e) {
            e.printStackTrace();
            //finally 里面的代码一定会被执行
        } finally {
            if(fos != null){
                try {
                    fos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }

        }

    }
}
