package com.xxxxxchen.myString;

import java.util.Scanner;

/*
 *
 *        案例：使用replace进行字符串的替换
 *
 * */
public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String s = sc.nextLine();

        String u = s.replace("TMD", "***");
        System.out.println(u);
    }
}
