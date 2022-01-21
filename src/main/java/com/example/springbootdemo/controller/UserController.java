package com.example.springbootdemo.controller;

import com.example.springbootdemo.domain.User;
import com.example.springbootdemo.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;




@RestController
@RequestMapping(value = "/users")     // 通过这里配置使下面的映射都在/users下
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("")
    public User[] getUserList() {
        User[] users = userService.getUsers();
        return users;
    }

    @PostMapping("")
    public void insertUser() {
        userService.insertUser();
    }

}