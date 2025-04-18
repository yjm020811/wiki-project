package com.example.demo.req;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;

public class PageReq {
    @NotNull(message = "【页码】不能为空")
    private Integer page;

    @NotNull(message = "【每页条数】不能为空")
    @Max(value = 100, message = "【每页条数】不能大于100")
    private Integer size;

    // 在 PageReq 中添加无参构造函数
    public PageReq() {
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "PageReq{" +
                "page=" + page +
                ", size=" + size +
                '}';
    }
}
