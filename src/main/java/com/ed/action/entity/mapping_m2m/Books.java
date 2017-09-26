package com.ed.action.entity.mapping_m2m;

import java.util.Date;

public class Books{
    private String Id;
    private String name;
    private Date time;//发布时间
    private Person master;//被谁所持有


    public void setMaster(Person master) {
        this.master = master;
    }

    public Person getMaster() {

        return master;
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