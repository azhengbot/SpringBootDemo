package com.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/hc")
public class CheckHealth {

    @GetMapping("hc")
    public String getHealthStatus() {
        return "ok";
    }
}
