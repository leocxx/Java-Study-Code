package com.chen.myvolatile;

public class Demo {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.setName("女");
        t1.start();

        MyThread2 t2 = new MyThread2();
        t2.setName("男");
        t2.start();
    }
}
