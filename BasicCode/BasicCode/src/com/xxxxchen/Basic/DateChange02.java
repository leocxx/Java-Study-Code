package com.xxxxchen.Basic;

/*
 *               案例：已知两个整数变量，a=10   b=20
 *                    打印输出b=20;a=10;
 *                    不使用第三方变量，使用位运算
 *              ^ 异或   ；一个数被另外一个数异或两次，这个数不变
 *
 * */
public class DateChange02 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a = a ^ b;  //a=10 ^ 20
        b = a ^ b;  //10 ^ 20 ^ 20    结果为10
        a = a ^b;   //10 ^ 20 ^ 10     结果为20

        System.out.println("a=" + a +"  "+ "b=" + b);
    }
}
