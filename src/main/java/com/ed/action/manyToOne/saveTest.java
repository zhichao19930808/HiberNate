package com.ed.action.manyToOne;


import com.ed.action.entity.manyToOne.Classs;
import com.ed.action.entity.manyToOne.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 保存带有关系的实体对象
 */
public class saveTest {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Classs classs = new Classs("Java");
        Student student1 = new Student("tom");
        Student student2 = new Student("张三");

        student1.setBan(classs);
        student2.setBan(classs);

        session.save(classs);
        session.save(student1);
        session.save(student2);
        session.getTransaction().commit();

        session.close();
        sessionFactory.close();
    }
}
