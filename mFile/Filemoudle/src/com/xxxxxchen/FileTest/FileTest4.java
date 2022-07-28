package com.xxxxxchen.FileTest;

import java.io.File;

public class FileTest4 {
    public static void main(String[] args) {
        /*删除一个多级文件夹*/
        File src = new File("C:\\Users\\KevinWilliams\\Desktop\\src");
        deleteDir(src);
    }

    private static void deleteDir(File src) {
        //先删除这个文件夹里的所有文件
        //listFile();得到Src文件夹所有的File对象
        File[] files = src.listFiles();
        //遍历得到src文件夹里面的所有内容的File对象
        for (File file : files) {
            //判断 如果遍历到的File对象是一个文件，直接删除
            if(file.isFile()){
                file.delete();
            }else {
                //递归   参数一定是src里面所有内容的File对象
                deleteDir(file);
            }
        }
        //再删除这个文件夹
        src.delete();
    }
}
