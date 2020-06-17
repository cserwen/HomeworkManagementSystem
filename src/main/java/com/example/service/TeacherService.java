package com.example.service;

import com.example.entry.ResultReturn;
import com.example.entry.Teacher;
import com.example.mapper.TeacherMapper;
import com.example.util.ResultReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: dengzhiwen
 * @Date: 2020/6/17 23:35
 */
@Service
public class TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;


    public ResultReturn register(Teacher teacher){

        //先判断该教师是否注册过账号
        if (teacherMapper.getByTeacherId(teacher.getTeacherID()) == null){
            System.out.println("不存在");
            teacherMapper.insert(teacher);
            return ResultReturnUtil.fail("注册成功");
        }else {
            return ResultReturnUtil.fail("该教工号已被注册");
        }
    }
}
