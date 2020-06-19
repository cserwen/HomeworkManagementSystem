package com.example.mapper;

import com.example.entry.Student;
import com.example.entry.Teacher;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * @author: dengzhiwen
 * @Date: 2020/6/18 0:38
 */
public interface StudentMapper {

    @Select("select * from student where student_id = #{studentID}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "username", column = "user_name"),
            @Result(property = "password", column = "password")
    })
    Student getByStudentId(Long studentID);

    @Insert("insert into student(user_name, password, student_id, name) " +
            "values(#{username}, #{password}, #{studentID}, #{name})")
    void insert(Student student);

}
