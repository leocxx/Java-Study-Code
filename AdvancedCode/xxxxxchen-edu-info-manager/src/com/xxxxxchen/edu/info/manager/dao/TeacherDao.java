package com.xxxxxchen.edu.info.manager.dao;

import com.xxxxxchen.edu.info.manager.domain.Teacher;

public class TeacherDao {
    private static Teacher [] teachers = new Teacher[5];

    public static void deleteTeacherById(String id) {
        int index = getIndex(id);
        teachers[index] = null;
    }

    public static void updateTeacher(String id, Teacher newTeacher) {
        int index = getIndex(id);
        teachers[index] = newTeacher;
    }

    public boolean addteacher(Teacher t) {
        int index = -1;
        for (int i = 0; i < teachers.length; i++) {
            Teacher teacher = teachers[i];
            if(teacher == null){
                index = i;
                break;
            }
        }
        if(index == -1){
            return false;
        }else {
            teachers[index]= t;
            return true;
        }
    }

    public Teacher[] findAllTeacher() {
        return teachers;
    }

    public static int getIndex(String id){
        int index = -1;
        for (int i = 0; i < teachers.length; i++) {
            Teacher t = teachers[i];
            if(t != null && t.getId().equals(id)){
                index = i;
                break;
            }
        }
        return index;
    }
}
