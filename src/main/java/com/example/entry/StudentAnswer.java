package com.example.entry;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author: dengzhiwen
 * @Date: 2020/6/18 17:48
 */

@Getter
@Setter
@ToString
public class StudentAnswer {

    private Long id;
    private Long studentId;
    private Long homeworkId;
    private String title;
    private String content;
    private String answer;

    @JsonFormat( pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date submitTime;
}
