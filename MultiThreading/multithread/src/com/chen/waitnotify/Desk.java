package com.chen.waitnotify;
public class Desk {
    //定义一个标记
    //true表示有
    //false表示没有
    //public static Boolean flag =false;
    private boolean flag;
    //次数
    //public static int count =10;
    private int count;
    //锁对象
    //public static final Object lock = new Object();
    private final Object lock = new Object();

    public Desk() {
        this(false,10);
    }

    public Desk(boolean flag, int count) {
        this.flag = flag;
        this.count = count;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object getLock() {
        return lock;
    }
}
