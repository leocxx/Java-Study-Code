package com.chen.Threadatom2;

public class Demo {
    public static void main(String[] args) {
        MyThreadAtom m1 = new MyThreadAtom();

        for (int i = 0; i < 100; i++) {
            new Thread(m1).start();
        }
    }
}
