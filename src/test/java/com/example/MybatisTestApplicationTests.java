package com.example;

import com.example.Dao.sqlMapper.UserMapper;
import com.example.Service.doUser.IUserService;
import com.example.Service.doUser.UserService;
import com.example.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootTest
class MybatisTestApplicationTests {

//    @Autowired
//    private UserDao userdao;
//
//    @Autowired
//    private UserFrontDao userfrontdao;
//
//    @Test
//    void TestUser(){
//        User user=new User();
//        user.setName("name");
//        user.setPassword("password");
//        user.setAge(26);
//        user.setTel("155082912870");
//        userdao.insert(user);
//        userfrontdao.insert(user);
//    }
//

    @Autowired
    UserMapper userMapper;

    @Test
    void Testm()throws IOException {
//        String resource = "Mybatis-Config.xml";
//
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//        SqlSession session=sqlSessionFactory.openSession(true);
//
//        UserMapper userMapper=session.getMapper(UserMapper.class);

//        User user1=userMapper.selectUserById(2);
////        System.out.println(user1);
//        User user2=userMapper.selectUserByName("陈志贤");
////        System.out.println(user2);
//        User user3=userMapper.selectUserLikeByName("%志%");
//        System.out.println(user3);
        String[] names={"%谢%", "%玉%"};
        List<User> users=userMapper.selectArrLikeByName(names);
        System.out.println(users);
//        session.close();
    }

    @Autowired
    private IUserService userservice;

    @Test
    public void testMPService(){
        User user=new User();
        user.setName("测试");
        user.setPassword("测试");
        user.setAge(666);
        user.setTel("测试");
        userservice.save(user);
    }
}
