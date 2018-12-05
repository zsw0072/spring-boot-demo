package com.arfa.springbootdemo.service.impl;

import com.arfa.springbootdemo.entity.User;
import com.arfa.springbootdemo.repository.UserRepository;
import com.arfa.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getUsers(){
        return userRepository.findUsers();
    }

    public User findUserById(User user){
        return userRepository.findUserByUid(user.getUid());
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }
}
