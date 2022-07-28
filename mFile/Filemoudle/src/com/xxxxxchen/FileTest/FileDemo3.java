package com.xxxxxchen.FileTest;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        File file = new File("Filemoudle\\chen");
        if(!file.exists()){
            boolean mkdirs = file.mkdirs();
            System.out.println(mkdirs);
        }
        File file1 = new File(file,"1.txt");
        boolean newFile = file1.createNewFile();
        System.out.println(newFile);
        System.out.println(file1);
    }
}
