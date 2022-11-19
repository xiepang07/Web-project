package com.example.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
@TableName("table_user")
public class User extends User_front{

    @TableId(type = IdType.AUTO)
    private Long id;//利用雪花算法自动生成id

    private String name;

    @TableField(select = false)
    private String password;//密码，匹配至数据库中的pwd栏目

    private Integer age;

    private String tel;

    @TableLogic(value = "0",delval = "1")
    private Integer deleted;

    @Version
    private Integer version;
}
