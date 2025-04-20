package com.example.demo.controller;

import com.example.demo.Entity.User;
import com.example.demo.config.Response;
import com.example.demo.req.UserReq;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    // 查询用户
    @GetMapping("/getList")
    public Response getUserList(UserReq req) {
        List<User> dataList = userService.getAllUser(req);
        return new Response(200, "success", dataList);
    }

    // 新增用户
    @PostMapping("/saveUser")
    public Response addUser(@RequestBody User user) {
        // 调用下面的getUser
        if (userService.getUser(user.getLoginName()) != null) {
            return new Response(400, "用户已存在", null);
        }
        userService.addUser(user);
        return new Response(200, "success", null);
    }

    // 修改用户
    @PutMapping("/editUser")
    public Response editUser(@RequestBody User user) {
        userService.editUser(user);
        return new Response(200, "success", null);
    }

    // 根据id删除用户
    @DeleteMapping("/deleteUser")
    public Response deleteUser(@RequestParam Integer id) {
        userService.deleteUser(id);
        return new Response(200, "success", null);
    }

    // 查询该用户是否在数据库已经存在了
    @GetMapping("/getUser")
    public Response getUser(@RequestParam String loginName) {
        User user = userService.getUser(loginName);
        if (user == null) {
            return new Response(400, "用户不存在", null);
        }
        return new Response(200, "success", user);
    }
}
