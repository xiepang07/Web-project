package com.example.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("table_user")
public class User extends User_front{

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;//利用雪花算法自动生成id

    private String name;

    @TableField(select = false)
    private String password;//密码，匹配至数据库中的pwd栏目

    private Integer age;

    private String tel;

    private Integer deleted;//逻辑删除设置已在配置文件中设置

    private Integer version;
}
