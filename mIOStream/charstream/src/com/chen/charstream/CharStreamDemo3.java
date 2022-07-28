package com.chen.charstream;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*字符流读取数据*/
        //1.创建字符输入流对象
        FileReader fr = new FileReader("charstream\\a.txt");
        //2.读取数据
        //依次读取数据
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.println((char) ch);
        }
        //3.释放资源
        fr.close();
    }
}
