package com.chen.selltickets;

public class Ticket implements Runnable {
    private int ticket = 100;
    private Object object = new Object();

    @Override
    public void run() {
        while (true) {
            //同步代码块
            synchronized (object){//多个线程必须使用同一把锁
                if (ticket <= 0) {
                    break;
                } else {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket--;
                    System.out.println(Thread.currentThread().getName() + "票剩下" + ticket + "张");
                }
            }
        }
    }
}
