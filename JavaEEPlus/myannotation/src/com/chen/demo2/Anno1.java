package com.chen.demo2;

public @interface Anno1 {
    //基本数据类型
    int a () default 23;
    //String
    String name ();
    //Class
    Class clazz () default Anno2.class;
    //注解
    Anno2 anno1() default @Anno2;
    //枚举
    Season season() default Season.AUTUMN;
    //以上类型的一维数组

    int [] arr () default {1,2,3,45,6};

    Season [] seasons () default {Season.AUTUMN,Season.SUMMER};
}
