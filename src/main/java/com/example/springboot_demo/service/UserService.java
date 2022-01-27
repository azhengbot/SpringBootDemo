package com.example.springboot_demo.service;

import com.example.springboot_demo.mapper.UserMapper;
import com.example.springboot_demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User getInstance(long id) {
        return userMapper.getInstance(id);
    }


    public User[] getList() {
        return userMapper.getList();
    }

    public User addInstance(User user) {
        userMapper.addInstance(user);
        return user;
    }
}
