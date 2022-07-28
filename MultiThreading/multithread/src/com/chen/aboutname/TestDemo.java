package com.chen.aboutname;

public class TestDemo {
    public static void main(String[] args) {
        MyThread m1 = new MyThread("大大");
        //m1.setName("大大");
        MyThread m2 = new MyThread("小小");
        //m2.setName("小小");
        m1.start();
        m2.start();
    }
}
