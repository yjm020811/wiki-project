package com.example.demo.service;

import com.example.demo.Entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;
    public User getByName(String name) {
        return userMapper.getByName(name);
    }

    public List<User> getAllUser() { // 返回集合类型
        return userMapper.getAllUserList();
    }
}
