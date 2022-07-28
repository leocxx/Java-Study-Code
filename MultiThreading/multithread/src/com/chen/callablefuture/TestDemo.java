package com.chen.callablefuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建一个MyCallable对象
        MyCallable mc = new MyCallable();
        MyCallable mc2 = new MyCallable();
        //创建一个FutureTask对象,相当于中间桥梁
        FutureTask<String> ft = new FutureTask<>(mc);
        FutureTask<String> ft2 = new FutureTask<>(mc2);
        //创建一个线程对象
        Thread t1 = new Thread(ft);
        Thread t2 = new Thread(ft2);
        //启动线程
        t1.start();
        t2.start();
        //启动线程之后，调用get，获得结束后的返回值
        String s1 = ft2.get();
        System.out.println(s1);
        String s = ft.get();
        System.out.println(s);
    }
}
