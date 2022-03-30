package com.capg.main;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.bean.bidir.one_to_one.Author;
import com.capg.bean.bidir.one_to_one.Book;
import com.capg.bean.bidir.one_to_one.BookOrder;

public class Bi_Dir_One_To_One_BookMain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sample");
		EntityManager em = emf.createEntityManager();

		EntityTransaction transaction = em.getTransaction();
		Book book = new Book();
		Author author = new Author();

		book.setBname("jpa for beginner");
		book.setCost(1200);

		author.setName("ram kumar");

		 book.setAuthor(author);//1st way from book --> author

		//author.setBook(book);// 2nd ways author -->book

		BookOrder bookOrder1=new BookOrder();
		BookOrder bookOrder2=new BookOrder();
		BookOrder bookOrder3=new BookOrder();
		
		bookOrder1.setOrderLocation("delhi");
		bookOrder1.setOrderDate(LocalDate.of(2022, 04, 10));
		
		bookOrder2.setOrderLocation("noida");
		bookOrder2.setOrderDate(LocalDate.of(2022, 03, 31));
		
		bookOrder3.setOrderLocation("gurugram");
		bookOrder3.setOrderDate(LocalDate.of(2022, 04, 15));
		
		Set<BookOrder> bookset=new HashSet<>();
		bookset.add(bookOrder1);
		bookset.add(bookOrder2);
		bookset.add(bookOrder3);
		
		book.setBookOrder(bookset);
		
		transaction.begin();
		 em.persist(book);//1st way from book --->author
		//em.persist(author);// 2nd ways author -->book
		transaction.commit();
	}
}
