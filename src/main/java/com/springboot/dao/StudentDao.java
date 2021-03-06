package com.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author zk
 * @Description: mybatis 的批量更新的借口
 * @date 2018-06-14 12:09
 */
/**
 * 表结构是
 *
 CREATE TABLE `student` (
 `id` int(11) DEFAULT NULL,
 `name` varchar(255) DEFAULT NULL,
 `age` int(11) DEFAULT NULL,
 `my_no` int(11) DEFAULT NULL
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 */
@Repository
public interface StudentDao {
    void uptateTable(@Param("lists") List<Map<String,Object>> lists);

    void uptateTable2(@Param("lists")List<Map<String, Object>> maps);

    void uptateTable3(@Param("lists")List<Map<String, Object>> maps);

    void uptateTable4(@Param("lists")List<Map<String, Object>> maps);


}
