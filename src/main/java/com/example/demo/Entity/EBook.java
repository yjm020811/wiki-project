package com.example.demo.Entity;

public class EBook {
    private int id;
    private String name;
    private int category1_id;
    private int category2_id;
    private String description;
    private String cover;
    private int doc_count;
    private int view_count;
    private int vote_count;

    public EBook(int id, String name, int category1_id, int category2_id, String description, String cover, int doc_count, int view_count, int vote_count) {
        this.id = id;
        this.name = name;
        this.category1_id = category1_id;
        this.category2_id = category2_id;
        this.description = description;
        this.cover = cover;
        this.doc_count = doc_count;
        this.view_count = view_count;
        this.vote_count = vote_count;
    }

    public EBook() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategory1_id() {
        return category1_id;
    }

    public void setCategory1_id(int category1_id) {
        this.category1_id = category1_id;
    }

    public int getCategory2_id() {
        return category2_id;
    }

    public void setCategory2_id(int category2_id) {
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

    public int getDoc_count() {
        return doc_count;
    }

    public void setDoc_count(int doc_count) {
        this.doc_count = doc_count;
    }

    public int getView_count() {
        return view_count;
    }

    public void setView_count(int view_count) {
        this.view_count = view_count;
    }

    public int getVote_count() {
        return vote_count;
    }

    public void setVote_count(int vote_count) {
        this.vote_count = vote_count;
    }

    @Override
    public String toString() {
        return "EBook{" +
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
