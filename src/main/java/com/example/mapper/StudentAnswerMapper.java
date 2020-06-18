package com.example.mapper;

import com.example.entry.Homework;
import com.example.entry.StudentAnswer;
import org.apache.ibatis.annotations.Insert;

/**
 * @author: dengzhiwen
 * @Date: 2020/6/18 17:52
 */
public interface StudentAnswerMapper {


    @Insert("insert into student_answer(student_id, homework_id, title, content, answer, submit_time)" +
            " values(#{studentId}, #{homeworkId}, #{title}, #{content}, #{answer}, #{submitTime})")
    void insert(StudentAnswer answer);
}
