package com.chen.threadpoll;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadPollDemo6 {
    public static void main(String[] args) {
        //创建线程池对象
        /*里面的参数：
         * 1.核心线程数量
         * 2.最大线程数
         * 3.空闲线程存活最大时间
         * 4.时间单位
         * 5.阻塞队列
         * 6.创建线程的方式
         * 7.任务的拒绝策略
         * */
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                1,
                2,
                100,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(1),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy());
        //第四种拒绝策略
        for (int i = 1; i <= 10; i++) {
            int y = i;
            pool.submit(() -> {
                System.out.println(Thread.currentThread().getName() + "---" + y);
            });
        }
        pool.shutdown();
    }
}

