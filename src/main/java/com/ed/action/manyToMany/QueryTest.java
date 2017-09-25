package com.ed.action.manyToMany;


import com.ed.action.entity.manyToMany.Classs;
import com.ed.action.entity.manyToMany.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class QueryTest {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        String hql = "from com.ed.action.entity.manyToMany.Student where sname=:sname";
        Query query = session.createQuery(hql);
        query.setParameter("sname", "小三");
        Student student= (Student) query.uniqueResult();
        System.out.println(student);
        for (Classs classs : student.getClasssList()) {
            System.out.println(classs.getCname());
        }
        session.getTransaction().commit();

        session.close();
        sessionFactory.close();
    }
}
