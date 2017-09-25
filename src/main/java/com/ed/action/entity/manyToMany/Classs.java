package com.ed.action.entity.manyToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.CascadeType;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="m2m_classs")
public class Classs {
    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @GeneratedValue(generator = "uuid")
    private String cid;
    private String cname;
    @ManyToMany(mappedBy = "classsList")
    @Cascade(CascadeType.SAVE_UPDATE)
    private List<Student> studentList = new ArrayList<Student>();

    public Classs(String cName) {
        this.cname = cName;
    }

    public Classs() {

    }

    @Override
    public String toString() {
        return "Classs{" +
                "cid='" + cid + '\'' +

                ", cname='" + cname + '\'' +
                '}';
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public String getCid() {

        return cid;
    }

    public String getCname() {
        return cname;
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}