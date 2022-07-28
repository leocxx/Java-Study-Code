package com.chen.priority;

import java.util.concurrent.FutureTask;

public class TestDemo {
    public static void main(String[] args) {
        MyCallable mc = new MyCallable();
        FutureTask<String> ft = new FutureTask<>(mc);
        Thread t1 = new Thread(ft);
        t1.setName("飞机");
        t1.setPriority(1);
        //System.out.println(t1.getPriority());
        t1.start();

        MyCallable mc1 = new MyCallable();
        FutureTask<String> ft1 = new FutureTask<>(mc1);
        Thread t2 = new Thread(ft1);
        t2.setName("坦克");
        t2.setPriority(10);
        //System.out.println(t2.getPriority());
        t2.start();
    }
}
