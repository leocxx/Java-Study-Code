package com.xxxxxchen.constructor;

public class Student extends Person{
    private int score;

    public Student (){
        super();
    }
    public Student (String name,int age,int score){
        super(name,age);
        this.score=score;
    }

   /* public Student(){
        System.out.println("子类的空参构造......");
    }

    public Student(int score){
        this.score=score;
        System.out.println("子类的有参构造......");

    }*/
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
