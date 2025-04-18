package com.example.demo.controller;

import com.example.demo.Entity.EBook;
import com.example.demo.config.Response;
import com.example.demo.req.EBookReq;
import com.example.demo.resp.EBookResp;
import com.example.demo.resp.PageResp;
import com.example.demo.service.EbookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ebooks")
public class EBookController {

    @Autowired
    private EbookService ebookService;

    // 分页查询书籍列表
    @GetMapping("/getBookList")
    public Response getEbookList(@Valid EBookReq req){
        PageResp<EBookResp> pageResp = ebookService.getEbookList(req);
        return new Response(200,"success",pageResp); // 直接返回分页对象
    }

    // 根据书籍名称模糊查询
    @GetMapping("/getBookListByName")
    public Response getEbookListByName(EBookReq req){
        if (req.getName() == null && req.getId() == null) {
            return new Response(400, "参数校验失败", null);
        }
        List<EBookResp> respList = ebookService.getEbookListByName(req);
        return new Response(200,"success",respList);
    }

    // 新增书籍
    @PostMapping("/addBook")
    public Response addEbook(@RequestBody EBookReq req){
        ebookService.addEbook(req);
        return new Response(200,"success",null);
    }

    // 根据id删除书籍
    @DeleteMapping("/deleteBook")
    public Response deleteEbook(@RequestParam Integer id){
        ebookService.deleteEbook(id);
        return new Response(200,"success",null);
    }

    // 编辑书籍
    @PutMapping("/editBook")
    public Response editEbook(@RequestBody EBookReq req){
        if(req.getId() == null) {
            return new Response(400,"修改书籍请传递id",null);
        }
        ebookService.editBook(req);
        return new Response(200,"success",null);
    }
}
