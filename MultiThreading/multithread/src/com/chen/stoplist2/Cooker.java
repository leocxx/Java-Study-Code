package com.chen.stoplist2;

import java.util.concurrent.ArrayBlockingQueue;

public class Cooker extends Thread {
    private ArrayBlockingQueue<String> list;

    public Cooker(ArrayBlockingQueue<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            try {
                list.put("汉堡包");
                System.out.println("厨师做了一个包");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
