package com.chen.protect;

public class TestDemo {
    public static void main(String[] args) {
        MyThread1 m1 = new MyThread1();
        MyThread2 m2 = new MyThread2();

        m1.setName("女神");
        m2.setName("备胎");

        //将线程m2设置为守护线程，当m1结束后，他会慢慢结束
        m2.setDaemon(true);

        m1.start();
        m2.start();
    }
}
