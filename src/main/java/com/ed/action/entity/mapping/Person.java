package com.ed.action.entity.mapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Person {
    private String Id;
    private String name;
    private Date time;//出生日期
    private List<Books> books = new ArrayList<>();//所持有的书

    public void setId(String id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }

    public String getId() {

        return Id;
    }

    public String getName() {
        return name;
    }

    public Date getTime() {
        return time;
    }

    public List<Books> getBooks() {
        return books;
    }
}
