package com.xxxxchen.method;

/*案例：
需求 ：设计一个print方法，用于打印n-m之间的奇数
*/
public class Demo04method {
    public static void main(String[] args) {
        print(10, 40);

    }

    public static void print(int n, int m) {
        System.out.println(n + "到" + m + "的奇数为：");
        for (int i = n; i <= m; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
