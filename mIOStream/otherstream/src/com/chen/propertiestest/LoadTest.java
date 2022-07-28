package com.chen.propertiestest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class LoadTest {
    public static void main(String[] args) throws IOException {
        //properties   load() 加载
        Properties prop = new Properties();
        FileReader fr = new FileReader("otherstream\\prop.properties");
        prop.load(fr);
        fr.close();
        System.out.println(prop);
    }
}
