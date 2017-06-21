package com.anxpp.demo.Exception;

import com.anxpp.demo.code.StatusCode;
import com.anxpp.demo.dto.SimpleResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public SimpleResponse handleBaseException(BusinessException e) {
        log.error("BusinessException :", e.getMessage());
        return SimpleResponse.builder().code(e.getCode()).message(e.getMessage()).build();
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public SimpleResponse handleException(Exception e) {
        log.error("Exception :", e.getMessage());
        return SimpleResponse.builder().code(StatusCode.ERROR.getCode()).message(e.getMessage()).build();
    }

}
