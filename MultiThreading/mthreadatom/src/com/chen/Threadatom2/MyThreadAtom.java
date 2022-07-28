package com.chen.Threadatom2;

public class MyThreadAtom implements Runnable{
    private Object lock =new Object();
    private volatile int count=0;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (lock) {
                count++;
                System.out.println("一共" + count + "次");
            }
        }
    }
}
