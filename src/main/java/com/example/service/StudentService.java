package com.example.service;

import com.example.entry.ResultReturn;
import com.example.entry.Student;
import com.example.entry.StudentAnswer;
import com.example.entry.Teacher;
import com.example.mapper.StudentAnswerMapper;
import com.example.mapper.StudentMapper;
import com.example.util.ResultReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: dengzhiwen
 * @Date: 2020/6/18 0:40
 */
@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private StudentAnswerMapper answerMapper;

    public ResultReturn register(Student student){
        //先判断该教师是否注册过账号
        if (studentMapper.getByStudentId(student.getStudentID()) == null){
            System.out.println("不存在");
            studentMapper.insert(student);
            return ResultReturnUtil.success("注册成功");
        }else {
            return ResultReturnUtil.fail("该学号已被注册");
        }
    }

    public ResultReturn login(Long studentID, String password){

        Student Student = studentMapper.getByStudentId(studentID);

        if (Student == null){
            return ResultReturnUtil.fail("该用户不存在");
        }else {
            if (Student.getPassword().equals(password))
                return ResultReturnUtil.success("登录成功");
            else
                return ResultReturnUtil.fail("密码错误");
        }
    }

    public ResultReturn submit(StudentAnswer answer){
        answerMapper.insert(answer);
        return ResultReturnUtil.success("提交成功");
    }
}
