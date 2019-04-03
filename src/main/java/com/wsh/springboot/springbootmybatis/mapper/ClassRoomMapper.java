package com.wsh.springboot.springbootmybatis.mapper;

import com.wsh.springboot.springbootmybatis.entity.ClassRoom;
import com.wsh.springboot.springbootmybatis.entity.Item;
import com.wsh.springboot.springbootmybatis.vo.ClassRoomTzVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Description: Mapper接口
 * @Author: weishihuai
 * @Date: 2019/3/31 09:11
 */
@Repository
public interface ClassRoomMapper {

    /**
     * 根据班级ID查询班级信息
     *
     * @param cid 班级ID
     * @return 班级信息
     */
    Map<String, Object> selectClassRoomById(@Param("cid") Integer cid);

    /**
     * 查询所有的班级以及关联的教师信息(嵌套结果方式)
     *
     * @return 班级以及关联的教师信息
     */
    List<ClassRoom> getAllClassRoomAndTeacherInfo01();

    /**
     * 查询所有的班级以及关联的教师信息(嵌套查询方式)
     *
     * @return 班级以及关联的教师信息
     */
    List<ClassRoom> getAllClassRoomAndTeacherInfo02();

    /**
     * 查询所有的班级以及关联的教师信息(拓展VO方式)
     *
     * @return 班级以及关联的教师信息
     */
    List<ClassRoomTzVO> getAllClassRoomAndTeacherInfo03();

    /**
     * 查询所有班级的所有学生(嵌套结果方式)
     *
     * @return 班级所有学生信息
     */
    List<ClassRoom> getAllStudents01();

    /**
     * 查询所有班级的所有学生(分步查询方式)
     *
     * @return 班级所有学生信息
     */
    List<ClassRoom> getAllStudents02();

    /**
     * 递归查找测评项以及测评项下面的子测评项
     *
     * @param id 测评项ID
     * @return 测评项以及测评项下面的子测评项
     */
    List<Item> getAllItemsAndChildItems(@Param("id") Integer id);

}
