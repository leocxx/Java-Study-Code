package com.chen.enumdemo2;

public class TestDemo1 {
    public static void main(String[] args) {
        /*枚举中的方法*/
        //1.String name()
        String name = Season.SPRING.name();
        System.out.println(name);//SPRING
        System.out.println("----------------------");

        //2.int ordinal()
        int index1 = Season.SPRING.ordinal();
        int index2 = Season.AUTUMN.ordinal();
        int index3 = Season.WINTER.ordinal();
        System.out.println(index1);//0
        System.out.println(index2);//2
        System.out.println(index3);//3
        System.out.println("----------------------");

        //3.int compareTo(Season.WINTER) 返回的是索引差值
        int i = Season.SPRING.compareTo(Season.WINTER);
        System.out.println(i);//-3
        System.out.println("----------------------");

        //4.String toString()
        String string = Season.SPRING.toString();
        System.out.println(string);//SPRING
        System.out.println("----------------------");

        //5.static<T> T valueOf()
        Season spring = Enum.valueOf(Season.class, "SPRING");
        System.out.println(spring);//SPRING
        System.out.println("----------------------");

        //6.values()
        Season[] values = Season.values();
        for (Season value : values) {
            System.out.println(value);
        }
    }
}
