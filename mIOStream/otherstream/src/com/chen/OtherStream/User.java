package com.chen.OtherStream;

import java.io.Serializable;
//抛出一个实例需要一个Serializable接口。 序列化运行时或实例的类可能会抛出此异常
//没有重写构造方法，仅仅是一个标记
public class User implements Serializable {
    private String name;
    private String passwd;

    public User() {
    }

    public User(String name, String passwd) {
        this.name = name;
        this.passwd = passwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }
}
