package com.wsh.springboot.springbootmybatis.entity;

import java.util.List;

/**
 * @Description: 班级实体类
 * @Author: weishihuai
 * @Date: 2019/3/31 09:06
 */
public class ClassRoom {

    /**
     * 班级ID
     */
    private Integer cid;
    /**
     * 班级名称
     */
    private String cname;
    /**
     * 班级的教师信息(假设一个老师只带一个班级)
     */
    private Teacher teacher;
    /**
     * 学生集合
     */
    private List<Student> students;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", teacher=" + teacher +
                ", students=" + students +
                '}';
    }
}
