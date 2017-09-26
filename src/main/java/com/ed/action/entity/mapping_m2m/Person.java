package com.ed.action.entity.mapping_m2m;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Person {
    private String Id;
    private String name;
    private Date time;//出生日期
    private Set<Books> books = new HashSet<>();//所持有的书

    public void setId(String id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setBooks(Set<Books> books) {
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

    public Set<Books> getBooks() {
        return books;
    }
}
