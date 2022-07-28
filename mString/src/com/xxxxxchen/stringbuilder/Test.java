package com.xxxxxchen.stringbuilder;

import java.util.Scanner;

/*
 *     案例：对称字符串
 *         reverse()    通过反转
 *
 * */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String str = sb.toString();
        if (s.equals(str)) {
            System.out.println("是对称");
        }else {
            System.out.println("不是对称");
        }
    }
}
