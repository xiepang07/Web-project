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
        boolean flag=userService.save(user);
        return new R(flag,flag?"添加成功":"添加失败");
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

    @PostMapping("/search")
    public R GetInfoLikeByname(@RequestBody String str){
        return new R(true,userService.getInfoLikeByName(str));
    }

    @DeleteMapping("{id}")
    public R DeleteById(@PathVariable Long id){
        boolean flag;
        return new R(flag=userService.removeById(id),flag?"删除成功":"删除失败");
    }

    @PutMapping
    public R UpdateById(@RequestBody User user){
        return new R(userService.modify(user));
    }
}
