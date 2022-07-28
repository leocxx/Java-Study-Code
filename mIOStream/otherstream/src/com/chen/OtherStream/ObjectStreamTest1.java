package com.chen.OtherStream;

import java.io.*;

public class ObjectStreamTest1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("张三", 37);
        Student s3 = new Student("张三", 29);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("otherstream\\a.txt"));
        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.writeObject(s3);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("otherstream\\a.txt"));
        Object obj;
        /*while ((obj = ois.readObject()) != null){
          System.out.println(obj);//EOFException
        }*/
        while (true){
            try {
                Object o = ois.readObject();
                System.out.println(o);
            } catch (IOException e) {
               break;
            }
        }
        ois.close();
    }
}

