package org.example.main;

import org.example.model.Student;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import java.util.List;


public class StudentMain_Using_Criteria {
    public static void main(String[] args) {
        Session session = new Configuration().configure().buildSessionFactory().openSession();

        Criteria criteria = session.createCriteria(Student.class);
        for(Object o:criteria.list()) {
            Student s = (Student) o;
            System.out.println(s.getRoll()+"\t"+s.getName()+"\t"+s.getDob()+"\t"+s.getMarks()+"\t"+s.getSubject());
        }

        System.out.println("===========================subject in range(math,science,hindi) s=========================");
        criteria = session.createCriteria(Student.class);
        criteria.add(Restrictions.like("name","s%"));
        for(Object o:criteria.list()) {
            Student s = (Student) o;
            System.out.println(s.getRoll()+"\t"+s.getName()+"\t"+s.getDob()+"\t"+s.getMarks()+"\t"+s.getSubject());
        }


        System.out.println("===========================subject  starting with s =========================");
        criteria = session.createCriteria(Student.class);
        criteria.add(Restrictions.in("subject",new String[]{"math","science","hindi"}));
        for(Object o:criteria.list()) {
            Student s = (Student) o;
            System.out.println(s.getRoll()+"\t"+s.getName()+"\t"+s.getDob()+"\t"+s.getMarks()+"\t"+s.getSubject());
        }

        System.out.println("===========================order by  =========================");
        criteria = session.createCriteria(Student.class);
      //  criteria.add(Restrictions.in("subject",new String[]{"math","science","hindi"}));
        criteria.addOrder(Order.asc("name"));
        for(Object o:criteria.list()) {
            Student s = (Student) o;
            System.out.println(s.getRoll()+"\t"+s.getName()+"\t"+s.getDob()+"\t"+s.getMarks()+"\t"+s.getSubject());
        }

  //using javax.persistence.criteria.CriteriaQuery instead deprecated org.hibernate.Criteria
        //javax.persistence.criteria.CriteriaQuery query=session.createQuery();




    }
}
