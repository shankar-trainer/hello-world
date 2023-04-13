package org.example.main;

import org.example.model.Student;
import org.example.model.Survey;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Scanner;


public class StudentMain1 {
    public static void main(String[] args) {
        Session session = new Configuration().configure().buildSessionFactory().openSession();

        Query query1 = session.createQuery("select s.subject, count(s.name) from  Student s group by s.subject ");
        List list = query1.list();

        for (Object s:list ) {
            Object o1[]= (Object[]) s;
            System.out.println(o1[0]+"\t"+o1[1]);
        }

    }
}
