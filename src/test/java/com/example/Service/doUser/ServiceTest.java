package com.example.Service.doUser;

import com.example.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ServiceTest {
    @Autowired
    private IUserService userService;

    @Test
    public void testMPService(){
        User user=new User();
        user.setName("测试");
        user.setPassword("测试");
        user.setAge(666);
        user.setTel("测试");
        userService.save(user);
    }
}
