package com.xxxxxchen.mtreemap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class test {
    public static void main(String[] args) {
        //匿名内部类
        /*TreeMap<Student,String> map = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge() - o2.getAge();
                result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                return result;
            }
        });*/
        //lambda表达式
        TreeMap<Student,String> map = new TreeMap<>(
                (Student o1, Student o2)->{
                    int result = o1.getAge() - o2.getAge();
                    result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                    return result;
                }
        );
        Student stu1 = new Student("zhangs",24);
        Student stu2 = new Student("lisi",21);
        Student stu3 = new Student("wangwu",19);
        Student stu4 = new Student("zhaoliu",35);

        map.put(stu1,"天津");
        map.put(stu2,"甘肃");
        map.put(stu3,"北京");
        map.put(stu4,"山东");

        map.forEach(
                (Student key, String value)->{
                    System.out.println(key + "-----" + value);
                }
        );
    }
}
