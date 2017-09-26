package com.ed.action;

import com.ed.action.entity.Books;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;


public class MappingTest {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        session.getTransaction().begin();

        Books book = new Books();
        book.setName("Java从入门到放弃");
        book.setTime(new Date());
        session.save(book);


        session.getTransaction().commit();
        sessionFactory.close();
    }
}
