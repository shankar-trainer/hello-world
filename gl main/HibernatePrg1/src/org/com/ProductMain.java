package org.com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ProductMain {
 public static void main(String[] args) {
	
	 SessionFactory sf1=HibernateUtil.getSF();
	 Session session=sf1.openSession();
	 Transaction transaction=session.beginTransaction();

	 Product product=new Product();
	 product.setPid(1003);
	 product.setName("hibernate in action");
	 product.setLocation("chennai");
	 	 
	 transaction.begin();
	 session.save(product);
	 
	 transaction.commit();
	 System.out.println("Product added");
	 session.close();
	 sf1.close();
	 
}
}
