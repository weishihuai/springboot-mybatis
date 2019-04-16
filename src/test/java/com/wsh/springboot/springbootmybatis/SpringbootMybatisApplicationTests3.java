package com.wsh.springboot.springbootmybatis;

import com.wsh.springboot.springbootmybatis.mapper.StudentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests3 {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void testNoParams() {
        List<Integer> pkids = new ArrayList<>();
        pkids.add(1);
        pkids.add(2);
        List<Map<String, Object>> students1 = studentMapper.getStudentsByListNoParamName(pkids);
        for (Map<String, Object> map : students1) {
            System.out.println(map);
        }

        List<Map<String, Object>> students2 = studentMapper.getStudentsByArrayNoParamName(new Integer[]{1, 2, 3});
        for (Map<String, Object> map : students2) {
            System.out.println(map);
        }

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("sname", "zhangsan2");
        List<Integer> pkids2 = new ArrayList<>();
        pkids2.add(1);
        pkids2.add(2);
        paramMap.put("pkids", pkids2);
        List<Map<String, Object>> students3 = studentMapper.getStudentsByMapNoParamName(paramMap);
        for (Map<String, Object> map : students3) {
            System.out.println(map);
        }
    }

    @Test
    public void testWithParams() {
        List<Integer> pkids = new ArrayList<>();
        pkids.add(1);
        pkids.add(2);
        List<Map<String, Object>> students1 = studentMapper.getStudentsByListWithParamName(pkids);
        for (Map<String, Object> map : students1) {
            System.out.println(map);
        }

        List<Map<String, Object>> students2 = studentMapper.getStudentsByArrayWithParamName(new Integer[]{1, 2, 3});
        for (Map<String, Object> map : students2) {
            System.out.println(map);
        }

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("sname", "zhangsan2");
        List<Integer> pkids2 = new ArrayList<>();
        pkids2.add(1);
        pkids2.add(2);
        paramMap.put("pkids", pkids2);
        List<Map<String, Object>> students3 = studentMapper.getStudentsByMapWithParamName(paramMap);
        for (Map<String, Object> map : students3) {
            System.out.println(map);
        }
    }

//    mybatis参数封装成map源码解析
//    ParamNameResolver.java:
//
//    // 假设args=[2,学生2],names={0=sid,1=sname}
//    public Object getNamedParams(Object[] args) {
//        int paramCount = this.names.size();
//        //参数不为空时,封装成map
//        if (args != null && paramCount != 0) {
//            //如果没有@Param注解并且参数个数只有一个,直接返回args[0]
//            if (!this.hasParamAnnotation && paramCount == 1) {
//                return args[(Integer)this.names.firstKey()];
//            } else {
//                Map<String, Object> param = new ParamMap();
//                int i = 0;
//                //遍历names: {0=sid,1=sname}
//                for(Iterator var5 = this.names.entrySet().iterator(); var5.hasNext(); ++i) {
//                    Entry<Integer, String> entry = (Entry)var5.next();
//                    //names集合的value作为key;
//                    //names集合的key作为取值的参考args[0]
//                    //params: sid=args[0]=2  sname=args[1]=学生2
//                    param.put(entry.getValue(), args[(Integer)entry.getKey()]);
//                    String genericParamName = "param" + String.valueOf(i + 1);
//                    //注意从1开始, param1...paramN
//                    //params: param1=2  param2=学生2
//                    if (!this.names.containsValue(genericParamName)) {
//                        param.put(genericParamName, args[(Integer)entry.getKey()]);
//                    }
//                }
//
//                return param;
//            }
//        } else {
//            //参数为空的时候直接return null
//            return null;
//        }
//    }

}
