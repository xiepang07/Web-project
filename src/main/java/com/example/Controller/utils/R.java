package com.example.Controller.utils;

import lombok.Data;

@Data
public class R {
    private Boolean flag;
    private Object Data;
    private String message;

    public R(){}

    public R(Boolean flag){
        this.flag=flag;
    }

    public R(Boolean flag,Object Data){
        this.Data=Data;
        this.flag=flag;
    }

    public R(String message){
        this.flag=false;
        this.message=message;
    }
}
