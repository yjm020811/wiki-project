package com.example.demo.req;

public class EBookReq extends PageReq {
    private Integer id;
    private String name;
    private Integer category1_id;
    private Integer category2_id;
    private String description;
    private String cover;
    private Integer doc_count;
    private Integer view_count;
    private Integer vote_count;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCategory1_id() {
        return category1_id;
    }

    public void setCategory1_id(Integer category1_id) {
        this.category1_id = category1_id;
    }

    public Integer getCategory2_id() {
        return category2_id;
    }

    public void setCategory2_id(Integer category2_id) {
        this.category2_id = category2_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Integer getDoc_count() {
        return doc_count;
    }

    public void setDoc_count(Integer doc_count) {
        this.doc_count = doc_count;
    }

    public Integer getView_count() {
        return view_count;
    }

    public void setView_count(Integer view_count) {
        this.view_count = view_count;
    }

    public Integer getVote_count() {
        return vote_count;
    }

    public void setVote_count(Integer vote_count) {
        this.vote_count = vote_count;
    }

    @Override
    public String toString() {
        return "EBookReq{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category1_id=" + category1_id +
                ", category2_id=" + category2_id +
                ", description='" + description + '\'' +
                ", cover='" + cover + '\'' +
                ", doc_count=" + doc_count +
                ", view_count=" + view_count +
                ", vote_count=" + vote_count +
                '}';
    }
}
