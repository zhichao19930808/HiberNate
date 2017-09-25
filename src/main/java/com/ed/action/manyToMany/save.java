package com.ed.action.manyToMany;

import com.ed.action.entity.manyToMany.Classs;
import com.ed.action.entity.manyToMany.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class save {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();
        session.getTransaction().begin();

        Classs c1 = new Classs("Java");
        Classs c2 = new Classs("Html");
        Classs c3 = new Classs("Css");

        Student student1 = new Student("tom");
        Student student2 = new Student("张三");
        Student student3 = new Student("李四");

        student2.getClasssList().add(c1);
        student2.getClasssList().add(c2);
//        student2.getClasssList().add(c3);



        session.save(student1);
        session.save(student2);
        session.save(student3);

        session.getTransaction().commit();

        session.close();
        sessionFactory.close();
    }
}
