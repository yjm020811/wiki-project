package com.example.demo.req;

public class ECategoryReq extends PageReq {
    private String name;

    public ECategoryReq() {
    }

    public ECategoryReq(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ECategoryReq{" +
                "name='" + name + '\'' +
                '}';
    }
}
