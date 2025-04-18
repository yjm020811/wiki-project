package com.example.demo.mapper;

import com.example.demo.Entity.EBook;
import com.example.demo.req.EBookReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface EbookMapper {
    List<EBook> getEbookList();

    List<EBook> getEbookListByName(EBookReq req);

    void addEbook(EBookReq req);

    void deleteEbook(Integer id);

    void editBook(EBookReq req);
}
