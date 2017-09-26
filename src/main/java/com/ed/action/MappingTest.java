package com.ed.action;

import com.ed.action.entity.mapping.Books;
import com.ed.action.entity.mapping.Person;
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

        Person person = new Person();
        person.setName("李四");
        person.setTime(new Date());
        session.save(person);

        Books books = new Books();
        books.setName("Java从入门到放弃");
        books.setTime(new Date());
        books.setMaster(person);
        session.save(books);


        session.getTransaction().commit();
        sessionFactory.close();
    }
}
