package com.example.mapper;

import com.example.entry.Homework;
import com.example.entry.StudentAnswer;
import org.apache.ibatis.annotations.*;

/**
 * @author: dengzhiwen
 * @Date: 2020/6/18 17:52
 */
public interface StudentAnswerMapper {


    @Insert("insert into student_answer(student_id, homework_id, title, content, answer, submit_time)" +
            " values(#{studentId}, #{homeworkId}, #{title}, #{content}, #{answer}, #{submitTime})")
    void insert(StudentAnswer answer);

    @Update("update student_answer set answer=#{answer}, submit_time=#{submitTime} where id=#{id}")
    void update(StudentAnswer answer);

    @Select("select * from student_answer where student_id=#{studentId} and homework_id=#{homeworkId}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "studentId", column = "student_id"),
            @Result(property = "homeworkId", column = "homework_id"),
            @Result(property = "title", column = "title"),
            @Result(property = "content", column = "content"),
            @Result(property = "answer", column = "answer"),
            @Result(property = "submitTime", column = "submit_time"),
    })
    StudentAnswer selectById(Long studentId, Long homeworkId);
}
