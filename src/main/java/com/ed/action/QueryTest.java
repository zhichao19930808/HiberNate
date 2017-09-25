package com.ed.action;


import com.ed.action.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class QueryTest {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        session.getTransaction().begin();

        String hql = "from Person where name=:name and age=:age";
        Query query = session.createQuery(hql);
        query.setParameter("name", "张三");
        query.setParameter("age", "18");

        Person person = (Person) query.uniqueResult();
        System.out.println(person);

        session.getTransaction().commit();
        sessionFactory.close();
    }
}
