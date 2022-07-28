package com.chen.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class ChildThread3 extends Thread {
    private CountDownLatch countDownLatch;

    public ChildThread3(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {
        //线程进行
        for (int i = 1; i < 4; i++) {
            System.out.println(getName() + "线程第" + i + "次进行");
        }
        //执行完毕
        countDownLatch.countDown();
    }
}
