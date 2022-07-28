package com.chen.OtherStream;

import java.io.*;
import java.util.ArrayList;

public class ObjectStreamTest2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("张三", 37);
        Student s3 = new Student("张三", 29);
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
        oos.writeObject(list);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        ArrayList<Student> list2 = (ArrayList<Student>) ois.readObject();
        for (Student student : list2) {
            System.out.println(student);
        }
        ois.close();
    }
}
