package com.chen.Threadatom4;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThreadAtom1 {
    public static void main(String[] args) {
        /*AtomicInteger ac1 = new AtomicInteger(10);
        //get()方法
        System.out.println(ac1.get());*/

        /*AtomicInteger ac2 = new AtomicInteger(10);
        //第二种getAndIncrement()
        System.out.println(ac2.getAndIncrement());//10
        System.out.println(ac2.get());//11*/

        /*AtomicInteger ac3 = new AtomicInteger(10);
        //第三种incrementAndGet()
        System.out.println(ac3.incrementAndGet());//11
        System.out.println(ac3.get());//11*/

        /*AtomicInteger ac4 = new AtomicInteger(10);
        //第四种addAndGet(data)
        int addAndGet = ac4.addAndGet(10);
        System.out.println(addAndGet);//20
        System.out.println(ac4.get()); //20*/

        AtomicInteger ac5 = new AtomicInteger(10);
        //第五种getAndSet()
        int set = ac5.getAndSet(20);
        System.out.println(set);  //10
        System.out.println(ac5.get());  //20

    }
}
