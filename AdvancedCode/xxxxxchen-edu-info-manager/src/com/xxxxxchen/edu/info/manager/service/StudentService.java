package com.xxxxxchen.edu.info.manager.service;

import com.xxxxxchen.edu.info.manager.dao.BaseStudentDao;
import com.xxxxxchen.edu.info.manager.dao.OtherStudentDao;
import com.xxxxxchen.edu.info.manager.dao.StudentDao;
import com.xxxxxchen.edu.info.manager.domain.Student;
import com.xxxxxchen.edu.info.manager.factory.StudentDaoFactory;

public class StudentService {
    //1.创建一个StudentDao（库管）
    //private static OtherStudentDao studentDao = new OtherStudentDao();
    private static BaseStudentDao studentDao = StudentDaoFactory.getStudentDao();

    public Boolean addStudent(Student stu) {

        //2.将学生对象，传递给studentDao库管中的addStudent方法
        //3.将返回的boolean类型结果，返还给StudentController
        return studentDao.addStudent(stu);
    }

    public boolean isExists(String id) {
        Student[] stus = studentDao.findAllStudent();
        //假设数组不存在
        boolean exists = false;
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if (student != null && student.getId().equals(id)) {
                exists = true;
                break;
            }
        }
        return exists;
    }

    public static Student[] findAllStudent() {
        //1.调用库管对象的findAllStudent获取学生对象数组
        Student[] allStudent = studentDao.findAllStudent();
        //2.判断数组中是否有学生信息
        boolean flag = false;
        for (int i = 0; i < allStudent.length; i++) {
            Student stu = allStudent[i];
            if (stu != null) {
                flag = true;
                break;
            }
        }
        if (flag) {
            return allStudent;
        } else {
            return null;

        }
    }

    public void deleteStudentById(String delId) {
        studentDao.deleteStudentById(delId);
    }

    public void updateById(String updateId, Student newstu) {
        studentDao.updateById(updateId, newstu);
    }
}
