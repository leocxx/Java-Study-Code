package com.chen.charbuffer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferSpecial3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("charstream\\a.txt"));

        String line;
        while ((line=br.readLine())!= null){
            System.out.println(line);
        }
        br.close();
    }
}
