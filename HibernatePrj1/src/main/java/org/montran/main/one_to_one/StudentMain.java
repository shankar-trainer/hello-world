package org.montran.main.one_to_one;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.montran.model.one_to_one.Address;
import org.montran.model.one_to_one.Book;
import org.montran.model.one_to_one.Student;
import org.montran.util.SessionFactoryUtil;

public class StudentMain {

	public static void main(String[] args) {
      SessionFactory factory=SessionFactoryUtil.mySessionFactory();
      Session session=factory.openSession();
      
      Transaction transaction=session.beginTransaction();

      Student student=new Student();
      student.setName("p kumar");
      student.setSubject("science");
      student.setMarks(68.0f);
      
      Address address=new Address();

      address.setCity("sholapur");
      address.setState("maharastra");
      address.setPin(878781);
      
      student.setAddress(address);
      
      session.save(address);
      
      System.out.println("-------- oen to many ");
      
      Book b1=new Book();
      b1.setCost(789);
      b1.setBname("java beginner");
      
      Book b2=new Book();
      b2.setCost(500);
      b2.setBname("java expert");
      
      
      Book b3=new Book();
      b3.setCost(1200);
      b3.setBname("java in action");
      
      Set<Book> bookset=new HashSet<Book>();
      bookset.add(b1);
      bookset.add(b2);
      bookset.add(b3);
      
      student.setBookset(bookset);
      
      session.save(b1);
      session.save(b2);
      session.save(b3);
      
      session.save(student);
      
      transaction.commit();
      System.out.println("student address record added ");
      
	}
}
