package com.arfa.springbootdemo.mapper;


import com.arfa.springbootdemo.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("SELECT * FROM we_user")
    List<User> findAll();
}
