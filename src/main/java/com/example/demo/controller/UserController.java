package com.example.demo.controller;

import com.example.demo.Entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getList")
    public List<User> getUserList() {
        return userService.getAllUser();
    }

    @GetMapping("/name/{name}")
    public User getByName(@PathVariable String name){
       return userService.getByName(name);
    }
}
