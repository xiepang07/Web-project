package com.example.Controller;

import com.example.Service.doUser.IUserService;
import com.example.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/users")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping
    public R save(@RequestBody User user){
        return new R(userService.save(user));
    }
}
