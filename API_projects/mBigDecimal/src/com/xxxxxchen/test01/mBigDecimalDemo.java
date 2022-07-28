package com.xxxxxchen.test01;

import java.math.BigDecimal;

public class mBigDecimalDemo {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("5");
        BigDecimal b2 = new BigDecimal("10");

        //加法 add
        BigDecimal add = b1.add(b2);
        System.out.println("和为"+ add);
        //减法 subtract
        BigDecimal subtract = b2.subtract(b1);
        System.out.println("差为"+subtract);
        //乘法 multiply
        BigDecimal multiply = b1.multiply(b2);
        System.out.println("积为"+multiply);
        //除法 divide
        BigDecimal divide = b2.divide(b1);
        System.out.println("商为"+divide);
    }
}
