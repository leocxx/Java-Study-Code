package com.xxxxxchen.constructor;

public class Person {
    private String name;
    private int age;

    public Person (){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*

    //空参构造
    public Person (){
        System.out.println("父类的空参构造");
    }
    //有参构造
    public Person(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("父类的有参构造");
    }

*/


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
