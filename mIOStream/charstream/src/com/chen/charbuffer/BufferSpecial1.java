package com.chen.charbuffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferSpecial1 {
    public static void main(String[] args) throws IOException {
        /*字符缓冲流特有功能
        * BufferedWriter
        * newLine() 写一行行分隔符 有系统属性定义
        * */
        BufferedWriter bw = new BufferedWriter(new FileWriter("charstream\\a.txt"));
        String s = "哈哈哈哈";
        bw.write(s);
        bw.newLine();
        bw.write(89);
        bw.close();
    }
}
