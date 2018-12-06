package com.arfa.springbootdemo.controller;

import com.arfa.springbootdemo.entity.User;
import com.arfa.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
    @RequestMapping("/wechat")
public class HelloWorldController {

    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    public String HelloWorld(){
        return "hello world";
    }

    @RequestMapping("/getUsers")
    public List<User> getUser(String username, String password){
        List<User> existUser = userService.getUsers();
        return existUser;
    }

    @RequestMapping("/findUser")
    public User findUserById(Integer uid){
        User user = new User();
        user.setUid(uid);
        User existUser = userService.findUserById(user);
        if (existUser != null){
            return existUser;
        }else{
            System.out.println("用户不存在");
        }
        return null;
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public void addUser(@RequestParam(value = "username") String username,
                        @RequestParam(value = "password")String password){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        userService.addUser(user);
    }

    @RequestMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

}
