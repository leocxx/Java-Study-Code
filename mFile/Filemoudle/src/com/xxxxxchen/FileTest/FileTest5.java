package com.xxxxxchen.FileTest;

import java.io.File;
import java.util.HashMap;

public class FileTest5 {
    public static void main(String[] args) {
        /*统计一个文件夹中，每种文件出现的次数*/
        File file = new File("Filemoudle");
        HashMap<String, Integer> hm = new HashMap<>();
        getcount(hm, file);
        System.out.println(hm);
    }

    private static void getcount(HashMap<String, Integer> hm, File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if(f.isFile()){
                String filename = f.getName();
                String[] filenameArr = filename.split("\\.");
                if(filenameArr.length == 2 ){
                    String fileEndName = filenameArr[1];
                    if(hm.containsKey(fileEndName)){
                        Integer count = hm.get(fileEndName);
                        count++;
                        hm.put(fileEndName,count);
                    }else {
                        hm.put(fileEndName,1);
                    }
                }
            }else {
                getcount(hm,f);
            }
        }
    }
}
