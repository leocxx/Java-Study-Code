package com.chen.charstream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //create();
        //字符流写数据
        //1.创建字符输出流对象
        FileWriter fw = new FileWriter("charstream\\a.txt");
        //2.写数据
        //2.1写入一个字符
        /*fw.write(97);
        fw.write(98);
        fw.write(99);*/
        //2.2写入一个数组
        /*char [] chars = {97,98,99,100};
        fw.write(chars);*/
        //2.3写入一个数组一部分
        /*char [] chars = {97,98,99,100};
        fw.write(chars,0,2);*/
        //2.4写入一个字符串
        fw.write("星星大帅哥666");
        //2.5写入一个字符串一部分
       /* String s = "星星大帅哥";
        fw.write(s,0,2);*/
        //3.释放资源
        fw.close();
    }
    private static void create() throws IOException {
        File file = new File("charstream\\a.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
    }
}
