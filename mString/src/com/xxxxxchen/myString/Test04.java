package com.xxxxxchen.myString;

import java.util.Scanner;

/*
 *
 *        案例：统计字符次数
 *
 * */
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");

        String s = sc.nextLine();

        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if (c >= 'a' && c <= 'z') {
                smallCount++;
            } else if (c >= '0' && c <= '9') {
                numCount++;
            }
        }
        System.out.println("大写总合计" + bigCount);
        System.out.println("小写总合计" + smallCount);
        System.out.println("数字总合计" + numCount);
    }
}
