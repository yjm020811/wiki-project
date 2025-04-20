package com.example.demo.service;

import com.example.demo.Entity.Category;
import com.example.demo.config.Response;
import com.example.demo.mapper.CategoryMapper;
import com.example.demo.req.ECategoryReq;
import com.example.demo.req.PageReq;
import com.example.demo.resp.PageResp;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    // 查询所有的category
    public PageResp<Category> getPageCategory(PageReq req) {
        // 启动分页
        Page<Object> page = PageHelper.startPage(req.getPage(), req.getSize());
        // 执行查询（此时会返回普通List）
        List<Category> dataList = categoryMapper.getPageCategory();
        // 手动封装分页响应
        PageResp<Category> resp = new PageResp<>();
        resp.setList(dataList);
        resp.setTotal((int) page.getTotal()); // 总记录数
        return resp;
    }

    public Response getAllCategory(ECategoryReq req) {
        List<Category> dataList = categoryMapper.getAllCategory(req);
        return new Response(200,"success",dataList);
    }

    public void addCategory(Category category) {
        categoryMapper.addCategory(category);
    }

    public void editCategory(Category category) {
        categoryMapper.editCategory(category);
    }

    public void deleteCategory(Integer id) {
        categoryMapper.deleteCategory(id);
    }
}
