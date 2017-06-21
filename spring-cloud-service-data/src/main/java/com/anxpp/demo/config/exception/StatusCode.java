package com.anxpp.demo.config.exception;


public enum StatusCode implements BaseCode {
    SUCCESS(200, "成功"),
    LOGIC_EXCEPTION(100, "业务异常"),
    ERROR(500, "未知错误");

    StatusCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}