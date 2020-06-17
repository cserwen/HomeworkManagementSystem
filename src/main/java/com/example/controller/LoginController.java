package com.example.controller;

import com.example.entry.ResultReturn;
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
public class LoginController {

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private StudentService studentService;

    @PostMapping("/teacher")
    public ResultReturn teacher(@RequestParam("teacherID") Long teacherID, @RequestParam("password") String password){

        return teacherService.login(teacherID, password);
    }

    @PostMapping("/student")
    public ResultReturn student(@RequestParam("studentID") Long teacherID, @RequestParam("password") String password){

        return studentService.login(teacherID, password);
    }
}
