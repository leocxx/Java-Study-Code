package com.chen.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(3); //参数表示等待的线程数

        MotherThread motherThread = new MotherThread(countDownLatch);
        motherThread.start();

        ChildThread1 c1 = new ChildThread1(countDownLatch);
        c1.setName("小米");
        ChildThread2 c2 = new ChildThread2(countDownLatch);
        c2.setName("小化");
        ChildThread3 c3 = new ChildThread3(countDownLatch);
        c3.setName("小拉");
        c1.start();
        c2.start();
        c3.start();
    }
}
