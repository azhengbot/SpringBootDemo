package com.example.springboot_demo.advice.utils;

import lombok.Data;

import java.io.Serializable;



@Data
class CommonRespBody<T> implements Serializable{

    private static final long serialVersionUID = 3068837394742385883L;
    /**错误码**/
    private Integer code;

    /**提示信息**/
    private String msg;

    /**具体内容**/
    private T data;
}


public class CommonResp {

    public static CommonRespBody<Object> success(Object object){
        CommonRespBody<Object> repBody=new CommonRespBody<>();
        repBody.setData(object);
        repBody.setCode(1);
        repBody.setMsg("成功");
        return repBody;
    }

    public static CommonRespBody<Object> success(){
        return success(null);
    }

    public static CommonRespBody<Object> error(Integer code,String msg){
        CommonRespBody<Object> repBody=new CommonRespBody<>();
        repBody.setCode(code);
        repBody.setMsg(msg);
        return repBody;
    }
}