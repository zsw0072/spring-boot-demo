package com.arfa.springbootdemo.mapper;

import com.arfa.springbootdemo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;


    @Test
    public void testQuery(){
        List<User> users = userMapper.findAll();
        System.out.println(users.toString());
    }

}
