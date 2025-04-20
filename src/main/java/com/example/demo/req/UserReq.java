package com.example.demo.req;

public class UserReq {
    private int id;
    private String loginName;

    public UserReq() {
    }

    public UserReq(int id, String loginName) {
        this.id = id;
        this.loginName = loginName;
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

    @Override
    public String toString() {
        return "UserReq{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                '}';
    }
}
