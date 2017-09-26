package com.ed.action.entity.mapping_o2o;


import java.util.Date;


public class Person {
    private String Id;
    private String name;
    private Date time;//出生日期
    private Book book ;//所持有的书

    public void setId(String id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setBook(Book book) {
        this.book = book;
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

    public Book getBook() {
        return book;
    }
}
