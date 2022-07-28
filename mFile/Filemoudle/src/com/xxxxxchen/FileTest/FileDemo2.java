package com.xxxxxchen.FileTest;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        //createNewFile() 创建一个新的空文件
        method1();


    }

    private static void method1() throws IOException {
        //注意：创建文件成功返回true
        // 创建失败或者创建的文件已经存在，返回false
        //不管调用者有没有后缀名，createNewFile只创建文件
        File file1 = new File("D:\\xxxxxchen\\2.txt");
        boolean result = file1.createNewFile();
        System.out.println(result);
    }
}
