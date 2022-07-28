package com.xxxxchen.Sentence.For;

/*
案例：求1-5的数据和，然后在控制台输出打印
*/
public class Demo03For {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
