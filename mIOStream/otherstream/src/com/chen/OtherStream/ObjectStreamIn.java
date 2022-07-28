package com.chen.OtherStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamIn {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("otherstream\\a.txt"));
        User o = (User) ois.readObject();
        System.out.println(o);
        ois.close();
    }
}
