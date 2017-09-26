package com.ed.action.entity;

import java.util.Date;

public class Books{
    private String Id;
    private String name;
    private Date time;//发布时间

    public void setId(String id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(Date time) {
        this.time = time;
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
}
