package com.example.controller;

import com.example.entry.ResultReturn;
import com.example.entry.Student;
import com.example.entry.StudentAnswer;
import com.example.mapper.StudentMapper;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: dengzhiwen
 * @Date: 2020/6/18 0:37
 */

@RestController
@RequestMapping("/student")
@CrossOrigin(allowCredentials="true",maxAge = 3600)
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/register")
    public ResultReturn register(@RequestBody Student student){
        System.out.println(student.toString());
        return studentService.register(student);
    }


    @RequestMapping("/submit")
    public ResultReturn submit(@RequestBody StudentAnswer answer){
        return studentService.submit(answer);
    }

    @RequestMapping("/updateAnswer")
    public ResultReturn updateAnswer(@RequestBody StudentAnswer answer){
        return  studentService.update(answer);
    }

    @RequestMapping("/reviewAnswer")
    public ResultReturn reviewAnswer(@RequestBody StudentAnswer answer){
        return studentService.getAnswer(answer.getStudentId(), answer.getHomeworkId());
    }
}
