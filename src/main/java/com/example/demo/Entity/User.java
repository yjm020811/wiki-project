package com.example.demo.Entity;

import jakarta.validation.constraints.NotNull;

public class User {
    private int id;
    @NotNull
    private String loginName;
    @NotNull
    private String name;

    public User() {
    }

    public User(int id, String loginName, String name) {
        this.id = id;
        this.loginName = loginName;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
