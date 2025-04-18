package com.example.demo.service;

import com.example.demo.Entity.EBook;
import com.example.demo.config.CopyUtil;
import com.example.demo.mapper.EbookMapper;
import com.example.demo.req.EBookReq;
import com.example.demo.resp.EBookResp;
import com.example.demo.resp.PageResp;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EbookService {

    @Autowired
    private EbookMapper ebookMapper;

    public PageResp<EBookResp> getEbookList(EBookReq req) {
        PageHelper.startPage(req.getPage(), req.getSize());
        List<EBook> eBookList = ebookMapper.getEbookList();
        // 1. 修复泛型类型
        List<EBookResp> eBookRespList = CopyUtil.copyList(eBookList, EBookResp.class);
        // 2. 正确封装分页结果
        PageInfo<EBook> pageInfo = new PageInfo<>(eBookList);
        PageResp<EBookResp> pageResp = new PageResp<>();
        pageResp.setTotal((int) pageInfo.getTotal());
        pageResp.setList(eBookRespList);
        return pageResp;
    }


    public List<EBookResp> getEbookListByName(EBookReq req) {
        List<EBook> ebooks = ebookMapper.getEbookListByName(req);
        return CopyUtil.copyList(ebooks, EBookResp.class);
    }

    public void addEbook(EBookReq req) {
        ebookMapper.addEbook(req);
    }

    public void deleteEbook(Integer id) {
        ebookMapper.deleteEbook(id);
    }

    public void editBook(EBookReq req) {
        ebookMapper.editBook(req);
    }
}
