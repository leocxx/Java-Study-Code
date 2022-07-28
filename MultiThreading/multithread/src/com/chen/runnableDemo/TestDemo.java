package com.chen.runnableDemo;

public class TestDemo {
    public static void main(String[] args) {
        //创建了一个MyRunnable类的对象
        MyRunnable mr = new MyRunnable();
        //创建了Thread类的对象，并把MyRunnable作为参数
        Thread t1 = new Thread(mr);

        MyRunnable mr1 = new MyRunnable();
        Thread t2 = new Thread(mr1);
        //启动线程
        t1.start();
        t2.start();
    }
}
