package com.chen.Threadatom3;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThreadAtom {
    public static void main(String[] args) {
        /*原子类*/
        //第一种没有参数构造 默认值为0
        AtomicInteger ac = new AtomicInteger();
        System.out.println(ac); //0
        //第二种有参数构造 可以指定值
        AtomicInteger ac2 = new AtomicInteger(10);
        System.out.println(ac2); //10
    }
}
