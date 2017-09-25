package com.ed.action.entity.manyToMany;


import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "m2m_student")
public class Student {
    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @GeneratedValue(generator = "uuid")
    private String sid;
    private String sname;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "m2m_classs_students",joinColumns = {@JoinColumn(name = "sid")},inverseJoinColumns = {@JoinColumn(name = "cId")})
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private List<Classs> classsList = new ArrayList<>();

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setClasssList(List<Classs> classsList) {
        this.classsList = classsList;
    }

    public String getSid() {

        return sid;
    }

    public String getSname() {
        return sname;
    }

    public List<Classs> getClasssList() {
        return classsList;
    }

    public Student(String sname) {

        this.sname = sname;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                ", classsList=" + classsList +
                '}';
    }
}
