package org.montran.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.montran.model.Library;
import org.montran.util.SessionFactoryUtil;

public class Library_Named_Query {

	public static void main(String[] args) {
		SessionFactory factory = SessionFactoryUtil.mySessionFactory();
		Session session = factory.openSession();

		Query createNamedQuery = session.createNamedQuery("getall");

		List<Library> list = createNamedQuery.list();
		System.out.println("using named query getall");

		list.forEach(a -> System.out.println(a.getLibrary_Reg_Id() + "  " + a.getLibrary_Name() + "  "
				+ a.getNo_of_Book() + "  " + a.getLibrary_Location()));

		createNamedQuery = session.createNamedQuery("getbyname");
		createNamedQuery.setParameter(1, "sk library");
		System.out.println("using named query getbyname");
		list = createNamedQuery.list();

		list.forEach(a -> System.out.println(a.getLibrary_Reg_Id() + "  " + a.getLibrary_Name() + "  "
				+ a.getNo_of_Book() + "  " + a.getLibrary_Location()));

	}
}
