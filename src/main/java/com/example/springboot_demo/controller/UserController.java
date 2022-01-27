package com.example.springboot_demo.controller;

import com.example.springboot_demo.domain.User;
import com.example.springboot_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/users")     // 通过这里配置使下面的映射都在/users下
public class UserController {

    private final UserService userService;
    /*
    依赖注入的三种方式：
        1. 变量（filed）注入
        2. 构造器注入 --> 强依赖
        3. set 方法注入 --> 选择依赖
     */
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("")
    public User[] getUserList() {
        return userService.getList();
    }

    @GetMapping("/{id}")
    public User getUserInstance(@PathVariable long id) {
        return userService.getInstance(id);
    }

    @PostMapping("")
    public User addUserInstance(@RequestBody User user) {
        return userService.addInstance(user);
    }

    @PutMapping("/{id}")
    public User updateUserInstance(@PathVariable long id, @RequestBody User user) {
        return userService.updateInstance(id, user);
    }

}