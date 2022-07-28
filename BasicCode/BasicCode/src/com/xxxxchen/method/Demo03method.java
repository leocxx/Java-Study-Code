package com.xxxxchen.method;

/*带参数方法的定义和调用*/
public class Demo03method {
    public static void main(String[] args) {
        IsNum(11,14);
    }
    public static void IsNum(int num,int a){
        if (num % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
        if (a % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }
}
