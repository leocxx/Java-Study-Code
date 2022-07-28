package com.chen.selltickets4;

import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {
    private int ticket = 100;
    private ReentrantLock lock = new ReentrantLock();
    //private Object object = new Object();

    @Override
    public void run() {
        while (true) {
            //Lock锁
            //synchronized (object){//多个线程必须使用同一把锁
            try {
                lock.lock();
                if (ticket <= 0) {
                    break;
                } else {
                    Thread.sleep(100);
                    ticket--;
                    System.out.println(Thread.currentThread().getName() + "票剩下" + ticket + "张");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}

