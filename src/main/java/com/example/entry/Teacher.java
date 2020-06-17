package com.example.entry;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author: dengzhiwen
 * @Date: 2020/6/17 22:39
 */

@Getter
@Setter
@ToString
public class Teacher {
    private Long id;
    //账号
    private String username;
    private String password;
    //名字
    private String name;
    //教工号
    private Long teacherID;
}
