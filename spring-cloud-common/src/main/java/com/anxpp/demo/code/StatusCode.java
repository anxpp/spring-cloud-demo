package com.anxpp.demo.code;

import lombok.Getter;

@Getter
public enum StatusCode implements Code {
    SUCCESS(200, "成功"),
    LOGIC_EXCEPTION(100, "业务异常"),
    ERROR(500, "未知错误");

    StatusCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;
}