package com.example.demo.mapper;

import com.example.demo.Entity.User;
import com.example.demo.req.UserReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

List<User> getAllUserList(UserReq req);

void addUser(User user);

void editUser(User user);

void deleteUser(Integer id);

User getUser(String loginName);
}
