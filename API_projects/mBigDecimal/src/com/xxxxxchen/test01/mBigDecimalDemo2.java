package com.xxxxxchen.test01;

import java.math.BigDecimal;

public class mBigDecimalDemo2 {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("0.3");
        BigDecimal b2 = new BigDecimal("5");

        /*BigDecimal divide = b2.divide(b1);
        System.out.println("商为"+divide);//ArithmeticException*/
        BigDecimal divide2 = b2.divide(b1, 2, BigDecimal.ROUND_UP);//进一发
        System.out.println(divide2);
        BigDecimal divide1 = b2.divide(b1, 2, BigDecimal.ROUND_FLOOR);//去尾法
        System.out.println(divide1);
        BigDecimal divide = b2.divide(b1, 2, BigDecimal.ROUND_HALF_UP);//四舍五入法
        System.out.println(divide);

    }
}
