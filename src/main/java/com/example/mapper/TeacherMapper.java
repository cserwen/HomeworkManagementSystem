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

    @Select("select * from teacher where teacher_id = #{teacherID}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "username", column = "user_name"),
            @Result(property = "password", column = "password")
    })
    Teacher getByTeacherId(Long teacherID);

    @Insert("insert into teacher(user_name, password, teacher_id) " +
            "values(#{username}, #{password}, #{teacherID})")
    void insert(Teacher teacher);

    @Update("update teacher set password=#{password}, name=#{name}, techer_id=#{teacherID}")
    void update(Teacher teacher);
}
