package com.xxxxxchen.mhashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class studentTest {
    public static void main(String[] args) {
        HashMap<Student,String> map = new HashMap<>();

        Student stu1 = new Student("小三",23,"甘肃");
        Student stu2 = new Student("小si",22,"兰州");
        Student stu3 = new Student("小wu",24,"广西");

        map.put(stu1,stu1.getJg());
        map.put(stu2,stu2.getJg());
        map.put(stu3,stu3.getJg());

        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "-----" + value);
        }
        System.out.println("=============================");
        //第三种遍历
        map.forEach(
                (Student key , String Value)->{
                    System.out.println(key + "-----" + Value);
                }
        );
    }
}
