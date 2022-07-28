package com.chen.charstream;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo4 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("charstream\\a.txt");

        char[] chars = new char[1024];
        int len;

        while ((len = fr.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));
        }
        fr.close();
    }
}
