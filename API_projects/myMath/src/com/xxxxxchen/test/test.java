package com.xxxxxchen.test;

public class test {
    public static void main(String[] args) {
        //public static int abs(int a) 返回参数的绝对值
        int abs = Math.abs(-10);
        System.out.println(abs);
        //public static double ceil(double a) 向上取整
        double ceil = Math.ceil(10.4);
        System.out.println(ceil);
        //public static double floor(double a)	向下取整
        double floor = Math.floor(10.9);
        System.out.println(floor);
        //public static int round(float a) 四舍五入
        long round = Math.round(4.3);
        System.out.println(round);
        //public static int max(int a,int b) 返回两个int值中的较大值
        int max = Math.max(19, 8);
        System.out.println(max);
        //public static int min(int a,int b) 返回两个int值中的较小值
        int min = Math.min(6, 8);
        System.out.println(min);
        //public static double pow(double a,double b)返回a的b次幂的值
        double pow = Math.pow(2, 3);
        System.out.println(pow);
        //public static double random()  返回值为double的正值，[0.0,1.0)
        for (int i = 0; i <= 10; i++) {
            double random = Math.random();
            System.out.println(random);
        }
    }
}
