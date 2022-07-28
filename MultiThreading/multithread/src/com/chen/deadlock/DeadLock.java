package com.chen.deadlock;

public class DeadLock {
    public static void main(String[] args) {
        Object objA = new Object();
        Object objB = new Object();

        //出现死锁的原因是锁的嵌套导致的
        new Thread(()->{
            synchronized (objA){
                synchronized (objB){
                    System.out.println("A");
                }
            }
        }).start();
        new Thread(()->{
            synchronized (objB){
                synchronized (objA){
                    System.out.println("B");
                }
            }
        }).start();
    }
}
