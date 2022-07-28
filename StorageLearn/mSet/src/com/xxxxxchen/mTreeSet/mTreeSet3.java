package com.xxxxxchen.mTreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class mTreeSet3 {
    public static void main(String[] args) {
        /*TreeSet<Teacher> ts = new TreeSet<>(new Comparator<Teacher>() {//匿名内部类
            @Override
            public int compare(Teacher o1, Teacher o2) {
                //o1是传进去的值，o2是要传的值
                int result = o1.getAge() - o2.getAge();
                result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                return result;
            }
        });*/
        //lambda表达式
        TreeSet<Teacher> ts = new TreeSet<>(
                (Teacher o1, Teacher o2)->{
                    int result = o1.getAge() - o2.getAge();
                    result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                    return result;
                }
        );

        Teacher t1 = new Teacher("zhangsan",29);
        Teacher t2 = new Teacher("wangwu",26);
        Teacher t3 = new Teacher("lisi",28);
        Teacher t4 = new Teacher("zhaoliu",28);

        ts.add(t1);
        ts.add(t2);
        ts.add(t3);
        ts.add(t4);

        System.out.println(ts);
    }
}
