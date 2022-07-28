package com.chen.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class ChildThread2 extends Thread {
    private CountDownLatch countDownLatch;

    public ChildThread2(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {
        //线程进行
        for (int i = 1; i < 5; i++) {
            System.out.println(getName() + "线程第" + i + "次进行");
        }
        //执行完毕
        countDownLatch.countDown();
    }
}
