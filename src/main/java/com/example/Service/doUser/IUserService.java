package com.example.Service.doUser;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.domain.User;

import java.util.List;

public interface IUserService extends IService<User>{
    public boolean modify(User user);
    public List<User> getInfoLikeByName(String name);
}
