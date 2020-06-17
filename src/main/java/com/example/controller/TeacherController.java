package com.example.controller;

import com.example.entry.Teacher;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: dengzhiwen
 * @Date: 2020/6/17 23:09
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @RequestMapping("/register")
    public Map<String, Object> register(@RequestBody Teacher teacher){
        System.out.println(teacher.toString());
        return new HashMap<>();
    }
}
