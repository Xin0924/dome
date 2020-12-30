package com.example.demo.controller;

import com.example.demo.bean.TestUser;
import com.example.demo.bean.UserBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({UserBody.class,TestUser.class})
public class HelloControllerBean {
    @Autowired
    UserBody userBody;
    @Autowired
    TestUser testUser;
    @GetMapping("/getUser")
    public String getUser(){
        return userBody.toString();
    }
    @GetMapping("/gettestuser")
    public String getTestUser(){
        return testUser.toString();
    }
}
