package com.wsh.springboot.springbootmybatis.entity;

/**
 * @Description: 教师实体类
 * @Author: weishihuai
 * @Date: 2019/3/31 08:56
 */
public class Teacher {
    /**
     * 教师编号
     */
    private Integer tid;
    /**
     * 教师姓名
     */
    private String tname;

    public Teacher() {
    }

    public Teacher(String tname) {
        this.tname = tname;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                '}';
    }

    public void setTname(String tname) {
        this.tname = tname;

    }

}
