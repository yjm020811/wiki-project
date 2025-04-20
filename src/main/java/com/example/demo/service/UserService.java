package com.example.demo.service;

import com.example.demo.Entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.req.UserReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUser(UserReq req) { // 返回集合类型
        return userMapper.getAllUserList(req);
    }

    public void addUser(User user) {
         userMapper.addUser(user);
    }

    public void editUser(User user) {
         userMapper.editUser(user);
    }

    public void deleteUser(Integer id) {
        userMapper.deleteUser(id);
    }

    public User getUser(String loginName) {
        return userMapper.getUser(loginName);
    }
}
