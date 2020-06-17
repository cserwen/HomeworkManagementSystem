package com.example.mapper;

import com.example.entry.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author: dengzhiwen
 * @Date: 2020/6/17 22:50
 */
public interface TeacherMapper {

    @Select("select * from teacher")
    @Results({
            @Result(property = "teacherID", column = "teacher_id"),
            @Result(property = "name", column = "name"),
            @Result(property = "password", column = "password")
    })
    List<Teacher> getAll();

    @Select("select * from teacher where id = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "username", column = "user_name"),
            @Result(property = "password", column = "password")
    })
    Teacher getById(Long id);

    @Insert("insert into teacher(id, user_name, password) values(#{id}, #{username}, #{password})")
    void insert(Teacher teacher);

    @Update("update teacher set password=#{password}, name=#{name}, techer_id=#{teacherID}")
    void update(Teacher teacher);
}
