package com.anxpp.demo.config.exception;

import lombok.Data;

@Data
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    public int code;

    public BusinessException(StatusCode code) {
        super(code.getMessage());
        this.setCode(code.getCode());
    }

    public BusinessException(int code, String msg) {
        super(msg);
        this.setCode(code);
    }

}