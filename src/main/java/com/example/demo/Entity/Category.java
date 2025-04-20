package com.example.demo.Entity;

public class Category {
    private int id;
    private int parent;
    private String name;
    private int sort;

    public Category() {
    }

    public Category(int id, int parent, String name, int sort) {
        this.id = id;
        this.parent = parent;
        this.name = name;
        this.sort = sort;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParent() {
        return parent;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", parent=" + parent +
                ", name='" + name + '\'' +
                ", sort=" + sort +
                '}';
    }
}
