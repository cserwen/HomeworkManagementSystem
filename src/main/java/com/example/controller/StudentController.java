package com.example.controller;

import com.example.entry.ResultReturn;
import com.example.entry.Student;
import com.example.mapper.StudentMapper;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: dengzhiwen
 * @Date: 2020/6/18 0:37
 */

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/register")
    public ResultReturn register(@RequestBody Student student){
        return studentService.register(student);
    }
}
