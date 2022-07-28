package com.xxxxxchen.edu.info.manager.dao;

import com.xxxxxchen.edu.info.manager.domain.Student;

import java.util.ArrayList;

public class OtherStudentDao implements BaseStudentDao{
    //1.创建集合容器
    private static ArrayList<Student> stus = new ArrayList<>();
    //使用静态代码块初始化一些学生数据
    static {
        Student stu1 = new Student("cx00001","陈星","34","1999-12-08");
        Student stu2 = new Student("cx00002","陈星2","12","1939-12-08");
        Student stu3 = new Student("cx00003","陈星3","31","1992-12-08");
        stus.add(stu1);
        stus.add(stu2);
        stus.add(stu3);

    }
    @Override
    public Boolean addStudent(Student stu) {
        stus.add(stu);
        return true;
    }
    @Override
    public Student[] findAllStudent() {
        Student[] students = new Student[stus.size()];
        for (int i = 0; i < students.length; i++) {
            students[i]=stus.get(i);
        }
        return students;
    }
    @Override
    public void deleteStudentById(String delId) {
        //1.查找id在容器中的索引位置
        int index = getIndex(delId);
        stus.remove(index);
    }
    @Override
    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < stus.size(); i++) {
            Student stu = stus.get(i);
            if (stu != null && stu.getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }
    @Override
    public void updateById(String updateId, Student newstu) {
        //1.查找updateId在容器中的索引位置
        int index = getIndex(updateId);
        stus.set(index,newstu);

    }
}
