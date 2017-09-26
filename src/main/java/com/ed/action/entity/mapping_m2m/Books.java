package com.ed.action.entity.mapping_m2m;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Books{
    private String Id;
    private String name;
    private Date time;//发布时间
    private Set<Person> peoples = new HashSet<>();//被多个人所持有


    public void setPeoples(Set<Person> peoples) {
        this.peoples = peoples;
    }

    public Set<Person> getPeoples() {

        return peoples;
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



    public void setId(String id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(Date time) {
        this.time = time;
    }


}
