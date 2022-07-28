package com.xxxxxchen.edu.info.manager.service;

import com.xxxxxchen.edu.info.manager.dao.TeacherDao;
import com.xxxxxchen.edu.info.manager.domain.Teacher;

public class TeacherService {
    TeacherDao teacherDao = new TeacherDao();

    public static void updateTeacher(String id, Teacher newTeacher) {
        TeacherDao.updateTeacher(id,newTeacher);
    }

    public boolean addteacher(Teacher t) {
        return teacherDao.addteacher(t);
    }

    public boolean isExists(String id) {
        //1.获取Dao中的所有数组
        Teacher[] teachers = teacherDao.findAllTeacher();
        boolean exists = false;
        //2.遍历数组，取出每一个元素，进行判断
        for (int i = 0; i < teachers.length; i++) {
            Teacher teacher = teachers[i];
            if (teacher != null && teacher.getId().equals(id)) {
                exists = true;
                break;
            }
        }
        return exists;
    }

    public Teacher[] findAllTeacher() {
        Teacher[] allteacher = teacherDao.findAllTeacher();
        boolean flag = false;
        for (int i = 0; i < allteacher.length; i++) {
            Teacher t = allteacher[i];
            if (t != null) {
                flag = true;
                break;
            }
        }
        if (flag) {
            return allteacher;
        } else {
            return null;
        }
    }


    public void deleteTeacherById(String id) {
        TeacherDao.deleteTeacherById(id);
    }
}
