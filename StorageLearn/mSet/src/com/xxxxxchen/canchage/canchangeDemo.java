package com.xxxxxchen.canchage;

public class canchangeDemo {
    public static void main(String[] args) {
        /*定义一个方法，实现求n个数的和*/
        int getsum = getsum(20, 10, 10, 40, 20);
        System.out.println(getsum);
    }
    public static int getsum(int...arr){
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
