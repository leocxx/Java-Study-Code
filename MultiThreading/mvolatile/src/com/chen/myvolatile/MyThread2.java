package com.chen.myvolatile;

public class MyThread2 extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Money.money = 90000;
    }
}
