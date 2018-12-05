package com.arfa.springbootdemo.service;

import com.arfa.springbootdemo.entity.User;

import java.util.List;


public interface UserService {

    public List<User> getUsers();

    User findUserById(User user);

    User addUser(User user);
}
