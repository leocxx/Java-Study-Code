package com.chen.Threadatom5;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThreadAtom implements Runnable {
    //private Object lock =new Object();
    //private volatile int count = 0;
    AtomicInteger ac = new AtomicInteger(0);
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //synchronized (lock) {
            //count++;
            int count = ac.incrementAndGet();
            System.out.println("一共" + count + "次");
        }
        //}
    }
}
