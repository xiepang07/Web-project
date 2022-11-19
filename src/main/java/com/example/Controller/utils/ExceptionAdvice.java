package com.example.Controller.utils;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//Springmvc的异常处理器
@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler
    public R doException(Exception exception){
        exception.printStackTrace();
        return new R("服务器故障，请稍后再试。");
    }
}
