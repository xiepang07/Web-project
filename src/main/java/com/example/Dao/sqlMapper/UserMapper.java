package com.example.Dao.sqlMapper;


import com.example.domain.User;
import com.example.domain.User_front;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper{

    User selectUserById(@Param("id")long id);

    User selectUserByName(@Param("name") String name);

    User selectUserLikeByName(@Param("str")String str);

    User_front selectUserFrontById(@Param("id") long id);

    User_front selectUserFrontByName(@Param("name") String name);

    List<User> selectArrLikeByName(@Param("names")String[] names);
}
