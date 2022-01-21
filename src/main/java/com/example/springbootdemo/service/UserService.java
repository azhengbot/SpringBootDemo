package com.example.springbootdemo.service;

import com.example.springbootdemo.dao.mapper.UserMapper;
import com.example.springbootdemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }


    public User[] getUsers() {
        User[] all = userMapper.findAll();
        return all;
    }

    public void insertUser() {
    }
}
