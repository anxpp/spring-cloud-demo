package com.anxpp.demo.dto;

/**
 * 响应消息
 * Created by yangtao on 2017/6/20.
 */
public class SimpleResponse {

    private Integer code = 0;

    private Object data;

    private String message = "success";

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
