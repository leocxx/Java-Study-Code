package com.xxxxchen.method;

public class Demo05method {
    /*
      带有返回值的方法的定义和调用
      案例：两个整数相加的和
    */
    public static void main(String[] args) {
        int num = add(14, 15);
        System.out.println(num);
    }

    public static int add(int a, int b) {
        int c = a + b;
        return c;
    }
}
