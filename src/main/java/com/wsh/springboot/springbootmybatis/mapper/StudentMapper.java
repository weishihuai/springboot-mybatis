package com.wsh.springboot.springbootmybatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Mapper接口
 *
 * @author weishihuai
 */
@Repository
public interface StudentMapper {

    /**
     * if
     */
    List<Map<String, Object>> testIf(@Param("sid") Integer sid, @Param("sname") String sname);

    /**
     * choose
     */
    List<Map<String, Object>> testChoose(@Param("sid") Integer sid, @Param("sname") String sname);

    /**
     * where
     */
    List<Map<String, Object>> testWhere01(@Param("sid") Integer sid, @Param("sname") String sname);

    List<Map<String, Object>> testWhere02(@Param("sid") Integer sid, @Param("sname") String sname);

    /**
     * 使用trim实现where同样功能
     */
    List<Map<String, Object>> testTrimWhere(@Param("sid") Integer sid, @Param("sname") String sname);

    /**
     * set
     */
    Integer testSet(@Param("sid") Integer sid, @Param("sname") String sname);

    /**
     * 使用trim实现set同样功能
     */
    Integer testSetTrim(@Param("sid") Integer sid, @Param("sname") String sname);

    /**
     * foreach
     */
    List<Map<String, Object>> testForEach(@Param("pkids") List<Integer> pkids);

    /**
     * sql
     */
    List<Map<String, Object>> testSql();


    /**
     * mybatis传复杂参数(不使用@Param("xxx")指定参数名称)
     */
    List<Map<String, Object>> getStudentsByListNoParamName(List<Integer> pkids);

    List<Map<String, Object>> getStudentsByArrayNoParamName(Integer[] pkids);

    List<Map<String, Object>> getStudentsByMapNoParamName(Map<String, Object> param);


    /**
     * mybatis传复杂参数(使用@Param("xxx")指定参数名称)
     */
    List<Map<String, Object>> getStudentsByListWithParamName(@Param("xsids") List<Integer> pkids);

    List<Map<String, Object>> getStudentsByArrayWithParamName(@Param("xsids") Integer[] pkids);

    List<Map<String, Object>> getStudentsByMapWithParamName(@Param("paramMap") Map<String, Object> param);

}
