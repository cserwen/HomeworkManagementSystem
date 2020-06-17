package com.example.util;

import com.example.entry.ResultReturn;

/**
 * 0成功， -1失败
 * @author: dengzhiwen
 * @Date: 2020/6/18 0:12
 */
public class ResultReturnUtil {

    public static ResultReturn success(String msg){
        return new ResultReturn(0, msg);
    }

    public static ResultReturn success(String msg, Object data){
        return  new ResultReturn(0,msg,data);
    }

    public static ResultReturn fail(String msg){
        return new ResultReturn(-1,msg);
    }

}
