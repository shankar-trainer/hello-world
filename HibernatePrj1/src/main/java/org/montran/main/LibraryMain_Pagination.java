package org.montran.main;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.montran.model.Library;
import org.montran.util.SessionFactoryUtil;

public class LibraryMain_Pagination {

	public static void main(String[] args) {
		
		SessionFactory factory=SessionFactoryUtil.mySessionFactory();
		Session session=factory.openSession();

		Query qr = session.createQuery("from Library");

		qr.setTimeout(4);
		
		qr.setFirstResult(1);
		qr.setMaxResults(10);
		
		qr.setComment("paigination");
		
		List<Library> list = qr.list();
		
		list.forEach(a->System.out.println(a.getLibrary_Reg_Id()+"  "+a.getLibrary_Name()
		   +"  "+a.getNo_of_Book()+"  "+a.getLibrary_Location()));
		
		
		session.close();
		factory.close();
	}
}
