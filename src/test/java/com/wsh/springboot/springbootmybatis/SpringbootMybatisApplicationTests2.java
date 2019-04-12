package com.wsh.springboot.springbootmybatis;

import com.wsh.springboot.springbootmybatis.mapper.StudentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests2 {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void testIf() {
        List<Map<String, Object>> list1 = studentMapper.testIf(null, "学生5");
        for (Map<String, Object> map : list1) {
            System.out.println(map);
        }

        List<Map<String, Object>> list2 = studentMapper.testIf(1, "");
        for (Map<String, Object> map : list2) {
            System.out.println(map);
        }

        List<Map<String, Object>> list3 = studentMapper.testIf(2, "学生2");
        for (Map<String, Object> map : list3) {
            System.out.println(map);
        }
    }

    @Test
    public void testChoose() {
        List<Map<String, Object>> list1 = studentMapper.testChoose(null, "学生5");
        for (Map<String, Object> map : list1) {
            System.out.println(map);
        }

        List<Map<String, Object>> list2 = studentMapper.testChoose(1, "");
        for (Map<String, Object> map : list2) {
            System.out.println(map);
        }

        List<Map<String, Object>> list3 = studentMapper.testChoose(2, "学生2");
        for (Map<String, Object> map : list3) {
            System.out.println(map);
        }

        List<Map<String, Object>> list4 = studentMapper.testChoose(null, null);
        for (Map<String, Object> map : list4) {
            System.out.println(map);
        }
    }

    @Test
    public void testWhere01() {
        List<Map<String, Object>> list1 = studentMapper.testWhere01(null, "学生5");
        for (Map<String, Object> map : list1) {
            System.out.println(map);
        }
    }

    @Test
    public void testWhere02() {
        List<Map<String, Object>> list1 = studentMapper.testWhere02(null, "学生5");
        for (Map<String, Object> map : list1) {
            System.out.println(map);
        }

        List<Map<String, Object>> list2 = studentMapper.testWhere02(1, "");
        for (Map<String, Object> map : list2) {
            System.out.println(map);
        }

        List<Map<String, Object>> list3 = studentMapper.testWhere02(2, "学生2");
        for (Map<String, Object> map : list3) {
            System.out.println(map);
        }

        List<Map<String, Object>> list4 = studentMapper.testWhere02(null, null);
        for (Map<String, Object> map : list4) {
            System.out.println(map);
        }
    }

    @Test
    public void testTrimWhere() {
        List<Map<String, Object>> list1 = studentMapper.testTrimWhere(null, "学生5");
        for (Map<String, Object> map : list1) {
            System.out.println(map);
        }

        List<Map<String, Object>> list2 = studentMapper.testTrimWhere(1, "");
        for (Map<String, Object> map : list2) {
            System.out.println(map);
        }

        List<Map<String, Object>> list3 = studentMapper.testTrimWhere(2, "学生2");
        for (Map<String, Object> map : list3) {
            System.out.println(map);
        }

        List<Map<String, Object>> list4 = studentMapper.testTrimWhere(null, null);
        for (Map<String, Object> map : list4) {
            System.out.println(map);
        }
    }

    @Test
    public void testSet() {
        studentMapper.testSet(1, "zhangsan");
        List<Map<String, Object>> list = studentMapper.testWhere01(1, null);
        for (Map<String, Object> map : list) {
            System.out.println(map);
        }
    }

    @Test
    public void testSetTrim() {
        studentMapper.testSetTrim(1, "zhangsan2");
        List<Map<String, Object>> list = studentMapper.testWhere01(1, null);
        for (Map<String, Object> map : list) {
            System.out.println(map);
        }
    }

    @Test
    public void testForEach() {
        List<Map<String, Object>> list = studentMapper.testForEach(Arrays.asList(1, 2, 3, 4, 5));
        for (Map<String, Object> map : list) {
            System.out.println(map);
        }
    }


    @Test
    public void testSql() {
        List<Map<String, Object>> list = studentMapper.testSql();
        for (Map<String, Object> map : list) {
            System.out.println(map);
        }
    }

}
