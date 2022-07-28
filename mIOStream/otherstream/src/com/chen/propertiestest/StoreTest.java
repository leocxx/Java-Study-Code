package com.chen.propertiestest;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class StoreTest {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.put("zhang1","123");
        prop.put("zhang2","456");
        prop.put("zhang3","789");

        FileWriter fw = new FileWriter("otherstream\\prop.properties");
        prop.store(fw,"123");
        fw.close();
    }
}
