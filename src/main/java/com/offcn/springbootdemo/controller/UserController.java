package com.offcn.springbootdemo.controller;

import com.offcn.springbootdemo.po.TestUser;
import com.offcn.springbootdemo.po.UserBody;
import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({UserBody.class, TestUser.class})
public class UserController {

    @Autowired
    private UserBody userBody;

    @Autowired
    private TestUser testUser;

    @RequestMapping("/getUser")
    public UserBody getUser(){

        return userBody;
    }

    @RequestMapping("/getTestUser")
    public TestUser getTestUser(){

        return testUser;

    }

}
