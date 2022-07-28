package com.chen.selltickets3;

public class MyRunnable implements Runnable {
    private static int ticketout = 100;
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
                synchronized (MyRunnable.class) {//同步静态方法的锁是class
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

    //同步静态方法
    private static synchronized boolean synchronizedMethod() {
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
