package com.example.entry;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author: dengzhiwen
 * @Date: 2020/6/18 2:02
 */

@Getter
@Setter
public class Homework {
    private long id;
    private String title;
    private String content;

    @JsonFormat( pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;

    @JsonFormat( pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updateTime;
}
