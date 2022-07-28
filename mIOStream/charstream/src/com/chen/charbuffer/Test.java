package com.chen.charbuffer;

import java.io.*;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException {
        /*读取文件中的数据排序之后再次写入本地文件*/
        //1，读取文件中的数据
        BufferedReader br = new BufferedReader(new FileReader("charstream\\a.txt"));
        String readLine = br.readLine();
        System.out.println("你读取到的数据为" + readLine);
        br.close();
        //排序
        String[] split = readLine.split(" ");
        int[] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            String sarr = split[i];
            int marr = Integer.parseInt(sarr);
            arr[i] = marr;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //再次写入本地文件中
        BufferedWriter bw = new BufferedWriter(new FileWriter("charstream\\a.txt"));
        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + " ");
            bw.flush();
        }
        bw.close();
    }
}
