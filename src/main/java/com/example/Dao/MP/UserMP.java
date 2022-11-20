package com.example.Dao.MP;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMP extends BaseMapper<User> {
}
