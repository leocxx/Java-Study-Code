package com.chen.threadDemo;
//1.继承Thread类
public class MyThread extends Thread{
    //2.重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程启动了" + i);
        }
    }
}
