package com.wsh.springboot.springbootmybatis;

import com.wsh.springboot.springbootmybatis.entity.ClassRoom;
import com.wsh.springboot.springbootmybatis.entity.Item;
import com.wsh.springboot.springbootmybatis.mapper.ClassRoomMapper;
import com.wsh.springboot.springbootmybatis.vo.ClassRoomTzVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {

    @Autowired
    private ClassRoomMapper classRoomMapper;

    //测试环境是否搭建成功
    @Test
    public void testSelectClassRoomById() {
        Map<String, Object> classRoom = classRoomMapper.selectClassRoomById(1);
        System.out.println(classRoom);
    }

    //测试 一对一关系映射  第一种方式
    @Test
    public void testGetAllClassRoomAndTeacherInfo01() {
        List<ClassRoom> allClassRoomAndTeacherInfo = classRoomMapper.getAllClassRoomAndTeacherInfo01();
        for (ClassRoom classRoom : allClassRoomAndTeacherInfo) {
            System.out.println(classRoom);
        }
    }

    //测试 一对一关系映射  第二种方式
    @Test
    public void testGetAllClassRoomAndTeacherInfo02() {
        List<ClassRoom> allClassRoomAndTeacherInfo = classRoomMapper.getAllClassRoomAndTeacherInfo02();
        for (ClassRoom classRoom : allClassRoomAndTeacherInfo) {
            System.out.println(classRoom);
        }
    }

    //测试 一对一关系映射  第三种方式
    @Test
    public void testGetAllClassRoomAndTeacherInfo03() {
        List<ClassRoomTzVO> allClassRoomAndTeacherInfo = classRoomMapper.getAllClassRoomAndTeacherInfo03();
        for (ClassRoomTzVO classRoomTzVO : allClassRoomAndTeacherInfo) {
            System.out.println(classRoomTzVO);
        }
    }

    //测试 一对多关系映射  第一种方式
    @Test
    public void testGetAllStudents01() {
        List<ClassRoom> allStudents = classRoomMapper.getAllStudents01();
        for (ClassRoom classRoom : allStudents) {
            System.out.println(classRoom);
        }
    }

    //测试 一对多关系映射  第二种方式
    @Test
    public void testGetAllStudents02() {
        List<ClassRoom> allStudents = classRoomMapper.getAllStudents02();
        for (ClassRoom classRoom : allStudents) {
            System.out.println(classRoom);
        }
    }

    //测试 递归查找测评项信息以及子测评项信息(树结构数据)
    @Test
    public void testGetAllItemsAndChildItems() {
        List<Item> items = classRoomMapper.getAllItemsAndChildItems(null);
        for (Item item : items) {
            System.out.println(item.getItemName());
            System.out.println(item.getChildren());
        }
    }

}
