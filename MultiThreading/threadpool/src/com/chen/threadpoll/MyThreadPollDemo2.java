package com.chen.threadpoll;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPollDemo2 {
    public static void main(String[] args) {
        //创建一个指定线程数量的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        //线程池默认为空，只不过最大容量为10
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName() + "被执行了");
        });
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName() + "被执行了");
        });

        executorService.shutdown();
    }
}
