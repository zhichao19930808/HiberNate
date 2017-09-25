package com.ed.action.entity.manyToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.CascadeType;
import javax.persistence.*;

@Entity
@Table(name = "m2o_student")
public class Student {
    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @GeneratedValue(generator = "uuid")
    private String sId;
    private String sName;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cId")
    @Cascade(CascadeType.SAVE_UPDATE)
    private Classs ban;//学生所在班级


    @Override
    public String toString() {
        return "Student{" +
                "sId='" + sId + '\'' +
                ", sName='" + sName + '\'' +
                ", ban=" + ban +
                '}';
    }

    public Student() {
    }

    public Student(String sName) {

        this.sName = sName;
    }

    public void setsId(String sId) {

        this.sId = sId;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setBan(Classs ban) {
        this.ban = ban;
    }

    public String getsId() {

        return sId;
    }

    public String getsName() {
        return sName;
    }

    public Classs getBan() {
        return ban;
    }
}
