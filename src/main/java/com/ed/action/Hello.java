package com.ed.action;


import com.ed.action.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hello {
    public static void main(String[] args) {
        //读取配置信息
        Configuration configuration = new Configuration().configure();
        //基于配置信息构建一个工厂
        SessionFactory sessionFactory = configuration.buildSessionFactory();//会有新线程产生

        Person person = new Person();
        person.setName("张三");
        person.setAge("18");

        Session session = sessionFactory.openSession();
        session.save(person);

        session.close();
        sessionFactory.close();

    }
}
