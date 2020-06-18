package com.example.mapper;

import com.example.entry.Homework;
import com.example.entry.Student;
import org.apache.ibatis.annotations.Insert;

/**
 * @author: dengzhiwen
 * @Date: 2020/6/18 16:40
 */
public interface HomeworkMapper {

    @Insert("insert into homework(title, content, create_time,update_time) " +
            "values(#{title}, #{content},#{createTime}, #{updateTime})")
    void insert(Homework homework);
}
