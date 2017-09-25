package com.ed.action.entity.manyToOne;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="m2o_classs")
public class Classs {
    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @GeneratedValue(generator = "uuid")
    private String cId;
    private String cName;
    @OneToMany(mappedBy = "ban")
    private List<Student> studentList = new ArrayList<Student>();

    public Classs(String cName) {
        this.cName = cName;
    }

    public Classs() {

    }

    @Override
    public String toString() {
        return "Classs{" +
                "cId='" + cId + '\'' +

                ", cName='" + cName + '\'' +
                ", studentList=" + studentList +
                '}';
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public String getcId() {

        return cId;
    }

    public String getcName() {
        return cName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
