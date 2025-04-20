package com.example.demo.service;

import com.example.demo.Entity.EBook;
import com.example.demo.config.CopyUtil;
import com.example.demo.mapper.EbookMapper;
import com.example.demo.req.EBookReq;
import com.example.demo.resp.EBookResp;
import com.example.demo.resp.PageResp;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EbookService {

    @Autowired
    private EbookMapper ebookMapper;

    public PageResp<EBookResp> getEbookList(EBookReq req) {
        Page<Object> page = PageHelper.startPage(req.getPage(), req.getSize());
        List<EBook> ebooks = ebookMapper.getEbookList();
        // 手动封装分页响应
        PageResp<EBookResp> resp = new PageResp<>();
        resp.setList(CopyUtil.copyList(ebooks, EBookResp.class));
        resp.setTotal((int) page.getTotal());
        return resp;
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
