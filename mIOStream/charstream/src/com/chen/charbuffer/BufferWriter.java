package com.chen.charbuffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {
    public static void main(String[] args) throws IOException {
        /*字符缓冲输出流*/
        BufferedWriter bw = new BufferedWriter(new FileWriter("charstream\\a.txt"));
        bw.write("星星大帅哥666");
        bw.flush();
        bw.write("\r\n");
        bw.write(89);

        bw.close();
     }
}
