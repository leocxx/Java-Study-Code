package com.chen.selltickets2;

public class MyRunnable implements Runnable {
    private int ticketout = 100;

    @Override
    public void run() {
        while (true) {
            if ("窗口一".equals(Thread.currentThread().getName())) {
                //同步方法
                boolean result = synchronizedMethod();
                if (result) {
                    break;
                }
            }

            if ("窗口二".equals(Thread.currentThread().getName())) {
                //同步代码块
               synchronized (this){
                   if (ticketout == 0) {
                       break;
                   } else {
                       try {
                           Thread.sleep(100);
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                       ticketout--;
                       System.out.println(Thread.currentThread().getName() + "票剩下" + ticketout + "张");
                   }
               }
            }
        }
    }

    private synchronized boolean synchronizedMethod() {
        if (ticketout == 0) {
            return true;
        } else {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticketout--;
            System.out.println(Thread.currentThread().getName() + "票剩下" + ticketout + "张");
            return false;
        }
    }
}
