package com.xxxxchen.Basic;

public class TestNumber {
    public static void main(String[] args) {
        int a = 177;
        int b = 188;
        int c = 200;

        int tempMax = a > b ? a : b;
        int max = tempMax > c ? tempMax : c;
        System.out.println(max);
    }
}
