package com.xxxxchen.method;

public class Demo06method {
    /*案例：
          设计一个方法，获取两个数的较大值，数据来自于参数
     */
    public static void main(String[] args) {
        int result = getMax(8, 2);
        System.out.println(result);
//        System.out.println(getMax(8, 2));  //直接输出调用，用于查看打印结果  8
    }

    public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
