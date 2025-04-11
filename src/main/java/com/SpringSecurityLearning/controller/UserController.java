package com.SpringSecurityLearning.controller;


import com.SpringSecurityLearning.entity.User;
import com.SpringSecurityLearning.repo.UserRepo;
import com.SpringSecurityLearning.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PrivateKey;
import java.util.Objects;

@RestController
public class UserController {


    private final UserService userService;

    private final UserRepo userRepo;


    public UserController(UserService userService, UserRepo userRepo) {
        this.userService = userService;
        this.userRepo = userRepo;
    }


    @PostMapping("/register")
    public User register(@RequestBody User user){
        return userService.register(user);
    }


    @PostMapping("/login")
    public String login(@RequestBody User user){
        return userService.verify(user);
    }

}