package com.chen.stoplist2;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodile extends Thread {
    private ArrayBlockingQueue<String> list;

    public Foodile(ArrayBlockingQueue<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true){
            try {
                String take = list.take();
                System.out.println("吃了"+take);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
