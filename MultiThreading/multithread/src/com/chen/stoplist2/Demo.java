package com.chen.stoplist2;



import java.util.concurrent.ArrayBlockingQueue;

public class Demo {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> list = new ArrayBlockingQueue<>(1);

        Foodile f = new Foodile(list);
        Cooker c = new Cooker(list);

        f.start();
        c.start();
    }
}
