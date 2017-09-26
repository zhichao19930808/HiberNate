package com.ed.action;

import com.ed.action.entity.mapping_o2o.Book;
import com.ed.action.entity.mapping_o2o.Person;
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

//        Person person = new Person();
//        person.setName("tom");
//        person.setTime(new Date());
//        session.save(person);
//        Person person = session.get(Person.class, "297e45075ebd62fc015ebd63051b0000");
//        Book book = new Book();
//        book.setName("想个名不容易");
//        book.setTime(new Date());
//        book.setMaster(person);
//        Book book1 = new Book();
//        book1.setName("确实不容易");
//        book1.setTime(new Date());
//        book1.setMaster(person);

//        session.save(book);
//        session.save(book1);

//        System.out.println("-----------------------------");
//        System.out.println(person.getName());
//        System.out.println("-----------------------------");
//        for (Books books : person.getBooks()) {
//            System.out.println(books.getName());
//        }

        session.getTransaction().commit();
        sessionFactory.close();
    }
}
