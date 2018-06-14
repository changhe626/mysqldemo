package com.springboot.controller;

import com.springboot.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zk
 * @Description: 测试批量更新
 * 因为没有地方发,就放在这里了.凑合看吧,直接使用的单数据源...我没有更改了
 * @date 2018-06-14 12:08
 */
@RestController
public class StudentController {

    @Autowired
    private StudentDao studentDao;

    @GetMapping("hello3")
    public String hello3(){
        List<Map<String, Object>> maps = new ArrayList<>();
        for (int i = 1; i < 3; i++) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("id",i);
            hashMap.put("name","name"+i);
            maps.add(hashMap);
        }
        studentDao.uptateTable(maps);
        studentDao.uptateTable2(maps);
        return  "hello ZhaoJun333";
    }


    @GetMapping("hello4")
    public String hello4(){
        List<Map<String, Object>> maps = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("id",i);
            hashMap.put("name","name"+i);
            hashMap.put("age",i*100);
            hashMap.put("my_no",i+""+i);
            maps.add(hashMap);
        }
        studentDao.uptateTable3(maps);
        return  "hello ZhaoJun333";
    }

}
