package com.chen.threadpoll;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPollDemo1 {
    public static void main(String[] args) {
        //创建一个默认空的线程池对象，默认最大容量为int的最大值
        ExecutorService executorService = Executors.newCachedThreadPool();
        //ExecutorService帮助控制线程
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName() + "被执行了");
        });

        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName() + "被执行了");
        });

        //关闭线程池
        executorService.shutdown();
    }
}
