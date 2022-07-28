package com.chen.threadDemo;

public class TestDemo {
    public static void main(String[] args) {
        //3.创建MyThread类的对象
        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();
        //4.启动线程
        m1.start();
        m2.start();
    }
}
