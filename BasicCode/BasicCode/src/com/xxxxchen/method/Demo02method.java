package com.xxxxchen.method;

/*
 需求：  设计一个method方法，方法中定义一个变量
        判断奇偶
        并在main方法中调用
  */
public class Demo02method {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        int num = 10;
        if (num % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }
}
