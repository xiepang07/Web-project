package com.example.Service.doUser;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.Dao.UserMP;
import com.example.Dao.sqlMapper.UserMapper;
import com.example.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService  extends ServiceImpl<UserMP, User> implements IUserService {

    @Autowired
    UserMP userMP;

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean modify(User user) {
        return userMP.updateById(user)>0;
    }

    public List<User> getInfoLikeByName(String str){
        String[] names=str.split(" ");
        for (String name:
             names) {
            name="%"+name+"%";
        }
        List<User> userList=userMapper.selectArrLikeByName(names);
        return userList;
    }
}
