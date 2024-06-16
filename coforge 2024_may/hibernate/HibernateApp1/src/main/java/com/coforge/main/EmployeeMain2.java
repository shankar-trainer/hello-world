package com.coforge.main;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.query.Query;

import com.coforge.model.Employee;
import com.coforge.util.MySessionFactory;

public class EmployeeMain2 {

    public static void main(String[] args) {

        SessionFactory factory = MySessionFactory.getSessionFactory();
        Session session = factory.openSession();

        // position based parameter
        Query query = session.createQuery("from Employee e where e.id>=?1");

//		query.setInteger(1, 10);
        query.setParameter(1, 10);

        List<Employee> resultList = query.getResultList();
        resultList.forEach(p -> System.out.println(p));
        Query query1 = session.createQuery("select e from Employee e where e.name=:name");

        // name based parameter
        // query.setString("name", "deepak kumar");
        query.setParameter("name", "deepak kumar");
        List<Employee> resultList1 = query1.getResultList();
        resultList1.forEach(p -> System.out.println(p));

	/*	Query namedQuery = session.createNamedQuery("allemp");

		System.out.println("named query ");
		namedQuery.getResultList().forEach(p -> System.out.println(p));
		
		Query namedQuery1 = session.createNamedQuery("empbyid");

		namedQuery1.setParameter(1, 8);
		System.out.println("named query 2");
		namedQuery1.getResultList().forEach(p -> System.out.println(p));*/
        session.close();

    }
}
