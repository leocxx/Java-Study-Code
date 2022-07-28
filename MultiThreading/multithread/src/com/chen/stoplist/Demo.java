package com.chen.stoplist;

import java.util.concurrent.ArrayBlockingQueue;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        //创建阻塞队列的对象，容量为1
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(1);

        //存储元素 put()
        arrayBlockingQueue.put("川川");

        //取出元素 take()
        System.out.println(arrayBlockingQueue.take());
        //System.out.println(arrayBlockingQueue.take());
        //如果取不到就会阻塞，导致程序无法结束
        System.out.println("程序结束了");
    }
}
