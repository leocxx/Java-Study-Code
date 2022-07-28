package com.xxxxchen.Basic;

/*
 *               案例：已知两个整数变量，a=10   b=20
 *                    打印输出b=20;a=10;
 *                  使用第三方变量temp
 *
 *
 * */
public class DateChange {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a=" + a +"  "+ "b=" + b);
    }
}
