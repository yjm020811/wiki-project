package com.example.demo.controller;


import com.example.demo.Entity.Category;
import com.example.demo.config.Response;
import com.example.demo.req.ECategoryReq;
import com.example.demo.req.PageReq;
import com.example.demo.resp.PageResp;
import com.example.demo.service.CategoryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    // 分页查询分类
    @GetMapping("/getPageCategory")
    public Response getPageCategory(@Valid PageReq req) {
       PageResp<Category> pageResp = categoryService.getPageCategory(req);
       return new Response(200,"success",pageResp);
    }

    // 查询所有的分类
    @GetMapping("/getAllCategory")
    public Response getAllCategory(ECategoryReq req) {
        Response dataList = categoryService.getAllCategory(req);
        return new Response(200,"success",dataList);
    }

    // 新增分类
    @PostMapping("/addCategory")
    public Response addCategory(@RequestBody Category category) {
        categoryService.addCategory(category);
        return new Response(200,"success",null);
    }

    // 修改分类
    @PutMapping("/editCategory")
    public Response editCategory(@RequestBody Category category) {
        categoryService.editCategory(category);
        return new Response(200,"success",null);
    }

    // 根据id删除分类
    @DeleteMapping("/deleteCategory")
    public Response deleteCategory(@RequestParam Integer id) {
        categoryService.deleteCategory(id);
        return new Response(200,"success",null);
    }
}
