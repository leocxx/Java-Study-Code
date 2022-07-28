package com.xxxxxchen.edu.info.manager.factory;

import com.xxxxxchen.edu.info.manager.dao.BaseStudentDao;
import com.xxxxxchen.edu.info.manager.dao.OtherStudentDao;
import com.xxxxxchen.edu.info.manager.dao.StudentDao;

public class StudentDaoFactory {
    public static BaseStudentDao getStudentDao(){
        return new OtherStudentDao();

    }}
