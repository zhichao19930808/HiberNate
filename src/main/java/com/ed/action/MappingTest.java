package com.ed.action;

import com.ed.action.entity.mapping_m2m.Books;
import com.ed.action.entity.mapping_m2m.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class MappingTest {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        session.getTransaction().begin();

//        Person person = new Person();
//        person.setName("李四");
//        person.setTime(new Date());
//        session.save(person);
        Person person = session.get(Person.class, "297e45075ebcf01e015ebcf0255e0000");
//        Books books = new Books();
//        books.setName("Java从入门到放弃");
//        books.setTime(new Date());
//        books.setMaster(person);
//        session.save(books);
//        Books books1 = new Books();
//        books1.setName("Java从入门到放弃再到入门");
//        books1.setTime(new Date());
//        books1.setMaster(person);
//        session.save(books1);
        System.out.println("-----------------------------");
        System.out.println(person.getName());
        System.out.println("-----------------------------");
        for (Books books : person.getBooks()) {
            System.out.println(books.getName());
        }

        session.getTransaction().commit();
        sessionFactory.close();
    }
}
