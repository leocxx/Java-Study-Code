package com.chen.waitnotify;

public class Foodie extends Thread{
    private Desk desk;
    public Foodie(Desk desk) {
        this.desk=desk;
    }

    @Override
    public void run() {
        while (true){
            synchronized (desk.getLock()){
                if(desk.getCount() == 0){
                    break;
                }else {
                    if(desk.isFlag()){
                        System.out.println("有，吃了");
                        desk.setFlag(false);
                        //唤醒
                        desk.getLock().notifyAll();
                        desk.setCount(desk.getCount() - 1);
                    }else {
                        //没有就等待
                        //使用什么对象当这个锁，那就用这个对象的等待和唤醒方法
                        try {
                            desk.getLock().wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
