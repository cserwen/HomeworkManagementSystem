package com.example.entry;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author: dengzhiwen
 * @Date: 2020/6/18 0:13
 */

@Getter
@Setter
public class ResultReturn{

    private int code;
    private String msg;
    private Object data;

    public ResultReturn(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultReturn(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
