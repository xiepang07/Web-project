package com.example.domain;

import lombok.Data;

@Data
public class R {
    private Boolean flag;
    private Object Data;


    public R(){}

    public R(Boolean flag){
        this.flag=flag;
    }

    public R(Boolean flag,Object Data){
        this.Data=Data;
        this.flag=flag;
    }
}
