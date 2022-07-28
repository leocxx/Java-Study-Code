package com.chen.protect;

public class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 109; i++) {
            System.out.println(getName() + "---" + i);
        }
    }
}
