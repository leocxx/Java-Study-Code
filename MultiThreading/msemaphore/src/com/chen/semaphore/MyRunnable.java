package com.chen.semaphore;

import java.util.concurrent.Semaphore;

public class MyRunnable implements Runnable{
    //1.获取管理员对象
    Semaphore semaphore = new Semaphore(2);//参数表示一次允许多少进程进去
    @Override
    public void run() {
        //2.接受通行证
        try {
            semaphore.acquire();
            //3.进行
            System.out.println("得到了通行证");
            Thread.sleep(2000);
            System.out.println("归还通行证");
            //4.归还通行证
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
