package com.xxxxxchen.edu.info.manager.dao;

import com.xxxxxchen.edu.info.manager.domain.Student;

public interface BaseStudentDao {
    public abstract Boolean addStudent(Student stu);

    public abstract Student[] findAllStudent();

    public abstract void deleteStudentById(String delId);

    public abstract int getIndex(String id);

    public abstract void updateById(String updateId, Student newstu);
}
