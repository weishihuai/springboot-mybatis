package com.wsh.springboot.springbootmybatis.entity;

/**
 * @Description: 学生实体类
 * @Author: weishihuai
 * @Date: 2019/3/31 20:51
 */
public class Student {
    /**
     * 学生ID
     */
    private Integer sid;
    /**
     * 学生姓名
     */
    private String sname;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }


    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                '}';
    }
}

