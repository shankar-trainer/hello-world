package org.example.main;

import org.example.model.Student;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;


public class StudentMain_Using_Criteria2 {
    public static void main(String[] args) {
        Session session = new Configuration().configure().buildSessionFactory().openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Student> query = criteriaBuilder.createQuery(Student.class);

        Root<Student> from = query.from(Student.class);
        CriteriaQuery<Student> select = query.select(from);

        TypedQuery<Student> query1 = session.createQuery(query);

        List<Student> resultList = query1.getResultList();
        resultList.forEach(a -> System.out.println(a));

    }
}
