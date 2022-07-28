package com.chen.sleepthread;

import com.chen.runnableDemo.MyRunnable;

public class TestDemo {
    public static void main(String[] args) {
        /*System.out.println("1");
        Thread.sleep(3000);
        System.out.println("2");*/
        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        t1.start();
        t2.start();
    }
}
