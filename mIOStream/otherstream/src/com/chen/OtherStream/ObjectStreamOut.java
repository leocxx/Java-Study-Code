package com.chen.OtherStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;

public class ObjectStreamOut {
    public static void main(String[] args) throws IOException {
        User user = new User("zhangsan","qwert");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("otherstream\\a.txt"));
        oos.writeObject(user);  //抛出一个实例需要一个Serializable接口。 序列化运行时或实例的类可能会抛出此异常
        oos.close();
    }
}
