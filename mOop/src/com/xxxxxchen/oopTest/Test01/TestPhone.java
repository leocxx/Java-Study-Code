package com.xxxxxchen.oopTest.Test01;

public class TestPhone {
    public static void main(String[] args) {
        Phone ph = new Phone();

        ph.brand = "菠萝";
        ph.price = 1999;

        System.out.println(ph.brand);
        System.out.println(ph.price);

        ph.call("星");
        ph.senMassage();
    }
}
