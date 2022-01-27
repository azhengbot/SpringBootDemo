package com.example.springboot_demo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
//@NoArgsConstructor
public class User {

    private Long id;
    private String name;
    private Integer age;

}