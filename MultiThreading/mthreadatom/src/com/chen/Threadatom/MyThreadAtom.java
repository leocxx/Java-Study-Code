package com.chen.Threadatom;

public class MyThreadAtom implements Runnable{
    private int count=0;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            count++;
            System.out.println("一共" + count + "次");
        }
    }
}
