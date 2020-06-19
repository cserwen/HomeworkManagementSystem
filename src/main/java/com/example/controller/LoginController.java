package com.example.controller;

import com.example.entry.ResultReturn;
import com.example.entry.Student;
import com.example.entry.Teacher;
import com.example.service.StudentService;
import com.example.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: dengzhiwen
 * @Date: 2020/6/18 0:58
 */

@RestController
@RequestMapping("/login")
@CrossOrigin(allowCredentials="true",maxAge = 3600)
public class LoginController {

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private StudentService studentService;


    @PostMapping("/teacher")
    public ResultReturn teacher(@RequestBody Teacher teacher){

        return teacherService.login(teacher.getTeacherID(), teacher.getPassword());
    }

    @PostMapping("/student")
    public ResultReturn student(@RequestBody Student student){
        System.out.println(student.toString());
        return studentService.login(student.getStudentID(), student.getPassword());
    }
}
