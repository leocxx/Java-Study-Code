package com.xxxxchen.method;

/*案例：用方法重载的思想，比较两个整数是否相同，兼容全整数类型（byte,short,int,long）*/
public class OverloadTest {
    public static void main(String[] args) {
        int a=10;
        int b=45;
        System.out.println(compare(a,b));
    }

    public static boolean compare(int a, int b) {
        return a == b;
    }
    public static boolean compare(short a, short b) {
        return a == b;
    }
    public static boolean compare(byte a, byte b) {
        return a == b;
    }
    public static boolean compare(long a, long b) {
        return a == b;
    }
}
