package com.coforge.main;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.model.Book;

public class BookMain2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter book name , cost  date(yyyy-mm-dd) and time(hh:mm:ss) ");
		//System.out.println("Enter book name , cost  ");
		
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter dateTimeFormatter1=DateTimeFormatter.ofPattern("HH:mm:ss");
		
		Session session = new Configuration().configure().buildSessionFactory().openSession();
             
			Transaction transaction = session.getTransaction();

			transaction.begin();
			
			Book book1=new Book();
			book1.setBname(sc.nextLine());
			book1.setCost(sc.nextFloat());

            String d1=sc.next();
			LocalDate parse = LocalDate.parse(d1, dateTimeFormatter);
			
			String t2=sc.next();
			LocalTime parse1 = LocalTime.parse(t2, dateTimeFormatter1);
			
			book1.setDate(parse);
			book1.setTime(parse1);
			
			session.save(book1);
			transaction.commit();
			
			
			session.createQuery("from Book").getResultList().forEach(a->System.out.println(a));
			
			sc.close();
			session.close();
			
	}
}
