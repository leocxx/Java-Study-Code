package com.chen.hashmap;

import java.util.HashMap;

public class MyHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        HashMap<String,String> hm = new HashMap<>();

        Thread t1 = new Thread(()->{
            for (int i = 0; i < 25; i++) {
                hm.put(i+" ",i+" ");
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 25; i < 51; i++) {
                hm.put(i+" ",i+" ");
            }
        });

        t1.start();
        t2.start();
        System.out.println("--------------------");
        Thread.sleep(1000);

        for (int i = 0; i < 51; i++) {
            System.out.println(hm.get(i + " "));
        }
    }
}
