package com.chen.testdemo;

public class Test {
    public static void main(String[] args) {

    }


    @org.junit.Test
    public void add() {
        //System.out.println(2/0); /// by zero
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println(sum);
    }
}
