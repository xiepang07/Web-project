package com.example.Service.doUser;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.Dao.UserMP;
import com.example.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceImpl<UserMP, User> implements IUserService{

    @Autowired
    UserMP userMP;

    @Override
    public boolean modify(User user) {
        return userMP.updateById(user)>0;
    }
}
