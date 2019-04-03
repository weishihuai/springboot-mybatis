package com.wsh.springboot.springbootmybatis.vo;

/**
 * @Description: 班级信息拓展VO
 * @Author: weishihuai
 * @Date: 2019/3/31 10:52
 */
public class ClassRoomTzVO {
    /**
     * 班级ID
     */
    private Integer cid;
    /**
     * 班级名称
     */
    private String cname;
    /**
     * 教师ID
     */
    private Integer tid;
    /**
     * 教师信息
     */
    private String tname;

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

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public String toString() {
        return "ClassRoomTzVO{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", tid=" + tid +
                ", tname='" + tname + '\'' +
                '}';
    }
}
