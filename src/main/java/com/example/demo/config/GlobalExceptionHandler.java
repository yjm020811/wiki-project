package com.example.demo.config;

import com.example.demo.resp.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    // 处理特定的异常
    @ExceptionHandler(value = IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse<String> handleIllegalArgumentException(IllegalArgumentException e) {
        System.out.println(e);
        return new ErrorResponse<>(HttpStatus.BAD_REQUEST.value(), e.getMessage(), null);
    }

    // 处理所有其他异常
    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse<String> handleException(Exception e) {
        return new ErrorResponse<>(HttpStatus.INTERNAL_SERVER_ERROR.value(),
                 e.getMessage(),
                null);
    }
}
