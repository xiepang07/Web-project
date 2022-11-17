package com.example.Controller;

import com.example.Controller.utils.R;
import com.example.Service.doUser.IUserService;
import com.example.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping
    public R save(@RequestBody User user){
        return new R(userService.save(user));
    }

    @GetMapping
    public R GetAll(){
        R r=new R(true,userService.list());
        return r;
    }

    @GetMapping("{id}")
    public R GetById(@PathVariable Long id){
        R r=new R(true,userService.getById(id));
        return r;
    }

    @DeleteMapping("{id}")
    public R DeleteById(@PathVariable Long id){
        return new R(userService.removeById(id));
    }

    @PutMapping
    public R UpdateById(@RequestBody User user){
        return new R(userService.modify(user));
    }
}
