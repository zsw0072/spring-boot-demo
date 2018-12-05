package com.arfa.springbootdemo.repository;

import com.arfa.springbootdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {


    User findUserByUid(Integer uid);

    @Query("select u from User u ")
    List<User> findUsers();


}
