package com.xxxxxchen.edu.info.manager.dao;

import com.xxxxxchen.edu.info.manager.domain.Student;


public class StudentDao implements BaseStudentDao{
    //1.创建数组容器
    private static Student [] stus = new Student[5];
    //使用静态代码块初始化一些学生数据
    static {
        Student stu1 = new Student("cx00001","陈星","34","1999-12-08");
        Student stu2 = new Student("cx00002","陈星2","12","1939-12-08");
        Student stu3 = new Student("cx00003","陈星3","31","1992-12-08");
        stus[0]=stu1;
        stus[1]=stu2;
        stus[2]=stu3;

    }

    @Override
    public Boolean addStudent(Student stu) {

        //2.添加学生到数组
        //2.1定义一个变量index为-1，假设数组存满，没有null的元素
        int index = -1;
        //2.2遍历数组取出每一个元素，判断是否为null
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if (student == null) {
                index = i;
                //2.3如果为null，让index记录当前索引位置，并用break结束循环遍历
                break;
            }
        }
        //3.返回是否添加成功的boolean类型状态
        if (index == -1) {
            //装满
            return false;
        } else {
            //没有，继续添加
            stus[index] = stu;
            return true;
        }
    }

    @Override
    public Student[] findAllStudent() {
        return stus;
    }

    @Override
    public void deleteStudentById(String delId) {
        //1.查找id在容器中的索引位置
        int index = getIndex(delId);
        //2.将该索引位置，使用null覆盖
        stus[index] = null;
    }

    @Override
    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
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
        //2.将该索引位置，使用新的对象覆盖
        stus[index] = newstu;

    }
}
