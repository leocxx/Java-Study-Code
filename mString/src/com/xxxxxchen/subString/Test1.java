package com.xxxxxchen.subString;

import java.util.Scanner;

/*
*     字符串的截取
*      substring();
*       substring();
*
*
* */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");

        String s = sc.nextLine();

        String start = s.substring(0, 3);
        String end =s.substring(7);

        System.out.println(start + "****" +end);
    }
}
