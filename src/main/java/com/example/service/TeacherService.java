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
            teacherMapper.insert(teacher);
            return ResultReturnUtil.success("注册成功");
        }else {
            return ResultReturnUtil.fail("该教工号已被注册");
        }
    }

    public ResultReturn login(Long teacherID, String password){

        Teacher teacher = teacherMapper.getByTeacherId(teacherID);

        if (teacher == null){
            return ResultReturnUtil.fail("该用户不存在");
        }else {
            if (teacher.getPassword().equals(password))
                return ResultReturnUtil.success("登录成功");
            else
                return ResultReturnUtil.fail("密码错误");
        }
    }
}
