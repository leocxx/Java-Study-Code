package com.xxxxchen.Sentence.For;

/*
案例：求1-100之间的奇数和，并在控制台打印输出
*/
public class Demo05For {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
