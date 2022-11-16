package com.example.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("table_user_front")
public class User_front {

    private Long id;

    private String name;

    private Integer deleted;
}
