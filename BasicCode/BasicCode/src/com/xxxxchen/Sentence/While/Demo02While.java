package com.xxxxchen.Sentence.While;

/*
    案例：珠穆朗玛峰高8844.43米，现在有0.1厚的纸张，纸张对叠多少次，才能达到
    不明确循环次数建议用while循环语句
    统计用count
*/
public class Demo02While {
    public static void main(String[] args) {
        int count = 0;
        double paper = 0.1;
        int zf = 8844430;
        while (paper <= zf) {
            paper *= 2;
            count++;
        }
        System.out.println(count);
    }
}
