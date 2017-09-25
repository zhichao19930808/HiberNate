package com.ed.action.manyToOne;


import com.ed.action.entity.manyToOne.Classs;
import com.ed.action.entity.manyToOne.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class FindTest {
    public static void main(String[] args) {
        //Configuration [kənˌfɪɡə'reɪʃn] 结构；布局；形态；
        //Configure  [kən'fɪgə] 配置
        Configuration configuration = new Configuration().configure();
        //factory   ['fæktri] 工厂
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();

        Classs classs = session.get(Classs.class, "297e45075eb74e77015eb74e7d950000");
        System.out.println("-----------------");
        System.out.println(classs.getcName());
        List<Student> studentList = classs.getStudentList();
        for (Student student : studentList) {
            System.out.println("-----------------");
            System.out.println(student.getsName());
        }

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
