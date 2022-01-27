package com.example.springboot_demo.controller;

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
