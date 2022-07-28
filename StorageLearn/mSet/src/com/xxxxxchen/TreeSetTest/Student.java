package com.xxxxxchen.TreeSetTest;

public class Student implements Comparable<Student>{
    private String name;
    private int chinese;
    private  int math;
    private  int english;

    public Student() {
    }

    public Student(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                '}'+ ",总分为" + getsum();
    }
    public int getsum(){
        int sum = this.chinese + this.english + this.math;
        return sum;
    }

    @Override
    public int compareTo(Student o) {
        int result = this.getsum() - o.getsum();
        //次要条件
        result = result == 0 ? this.getChinese() - o.getChinese() : result;
        result = result == 0 ? this.getMath() - o.getMath() : result;
        result = result == 0 ? this.getName().compareTo(o.getName()) : result;
        return result;
    }
}
