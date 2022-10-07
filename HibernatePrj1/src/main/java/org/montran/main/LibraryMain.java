package org.montran.main;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.montran.model.Library;
import org.montran.util.SessionFactoryUtil;

public class LibraryMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		SessionFactory factory=SessionFactoryUtil.mySessionFactory();
		Session session=factory.openSession();
	
		Transaction transaction = session.getTransaction();
		/*
		System.out.println();
		
		Library library=new Library();
		
		System.out.println("Enter library name");
	//	scanner.nextLine();
		library.setLibrary_Name(scanner.nextLine());
		
		System.out.println("Enter library location");
		library.setLibrary_Location(scanner.next());
		
		System.out.println("Enter no of books");
		library.setNo_of_Book(scanner.nextInt());
		
		transaction.begin();
		session.save(library);
		transaction.commit();
		System.out.println("library added");
		*/
		
		/*
		Library library=new Library();
		
		library.setLibrary_Name("gandhi library");
		
		library.setLibrary_Location("mumbai");
		library.setNo_of_Book(4000);
		
		transaction.begin();
		session.save(library);
		transaction.commit();
		*/
		
		Query qr = session.createQuery("from Library where  library_Name=?1 and library_Location=?2");
		//qr.setString(1, "sk library");
		//qr.setString(2, "noida");
		
		qr.setParameter(1, "sk library");
		qr.setParameter(2, "noida");
		
		List<Library> resultList = qr.getResultList();
		if(resultList.size()>=1) {
		for (Library library : resultList) {
		 System.out.println(library.getLibrary_Reg_Id()+"   "+library.getLibrary_Name()+"  "+library.getNo_of_Book()+"  "+library.getLibrary_Location());	
		}
		}
		else
			System.out.println("no record found");
		
		
		scanner.close();
		session.close();
		factory.close();
	}
}
