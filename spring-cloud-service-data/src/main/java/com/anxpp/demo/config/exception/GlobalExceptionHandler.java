package com.anxpp.demo.config.exception;

import com.anxpp.demo.dto.SimpleResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

    @ExceptionHandler(value = BusinessException.class)
    public SimpleResponse handleBaseException(BusinessException e) {
        log.error("BaseException : ", e);
        return SimpleResponse.builder().code(e.getCode()).message(e.getMessage()).build();
    }

    @ExceptionHandler(value = Exception.class)
    public SimpleResponse handleException(Exception e) {
        log.error("Exception ", e);
        return SimpleResponse.builder().code(StatusCode.ERROR.getCode()).message(e.getMessage()).build();
    }

}
