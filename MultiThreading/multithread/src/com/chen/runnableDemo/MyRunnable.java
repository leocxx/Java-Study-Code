package com.chen.runnableDemo;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "第二种实现多线程的方法" + i);
        }
    }
}
