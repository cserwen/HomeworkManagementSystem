package com.example.mapper;

import com.example.entry.Homework;
import com.example.entry.Student;
import com.example.entry.Teacher;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: dengzhiwen
 * @Date: 2020/6/18 16:40
 */
public interface HomeworkMapper {

    @Insert("insert into homework(title, content, create_time,update_time) " +
            "values(#{title}, #{content},#{createTime}, #{updateTime})")
    void insert(Homework homework);

    @Select("select * from homework where id = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "title", column = "title"),
            @Result(property = "content", column = "content"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "updateTime", column = "update_time")
    })
    Homework selectById(Long id);

    @Select("select * from homework")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "title", column = "title"),
            @Result(property = "content", column = "content"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "updateTime", column = "update_time")
    })
    List<Homework> selectAll();
}
