package com.example.demo.mapper;

import com.example.demo.Entity.Category;
import com.example.demo.req.ECategoryReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {

    List<Category> getPageCategory();

    List<Category> getAllCategory(ECategoryReq req);

    void addCategory(Category category);

    void editCategory(Category category);

    void deleteCategory(Integer id);
}
