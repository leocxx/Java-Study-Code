package com.xxxxxchen.myString;

import java.util.Scanner;

/*
 *
 *        案例：键盘录入一个字符串，遍历打印该字符串
 *
 * */
public class Test03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");

        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
