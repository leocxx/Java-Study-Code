package com.chen.charbuffer;

import java.io.*;

public class BufferSpecial2 {
    public static void main(String[] args) throws IOException {
        /*字符缓冲流特有功能
         * BufferedReader
         * readline() 读一行文字读不到就返回null
         * */
        BufferedReader br = new BufferedReader(new FileReader("charstream\\a.txt"));
        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();
        String s4 = br.readLine();
        String s5 = br.readLine();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        br.close();
    }
}
