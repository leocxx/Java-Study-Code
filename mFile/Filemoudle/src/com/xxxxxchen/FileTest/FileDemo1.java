package com.xxxxxchen.FileTest;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        //method1();
        //method2();
        //method3();
    }

    private static void method3() {
        //File (File parent,String child) 从父抽象路径名和子路径名字符串创建新的File实例
        File file1 = new File("D:\\xxxxxchen");
        String patn = "1.txt";
        File file = new File(file1,patn);
        System.out.println(file);//D:\xxxxxchen\1.txt
    }

    private static void method2() {
        //File (String parent,String child) 从父路径名字符串和子路径名字符串创建新的File实例
        String path1 = "C:\\xxxxxchen";
        String path2 = "1.txt";
        File file = new File(path1, path2);//拼接路径
        System.out.println(file);//C:\xxxxxchen\1.txt
    }

    private static void method1() {
        //File (String pathname)  通过将给定的路径名字符串转换为抽象路径名来创建新的File实例
        String path = "D:\\xxxxxchen\\1.txt";
        File file = new File(path);
        //目的就是为了使用File类里面的方法
    }
}
