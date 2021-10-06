package org.com.inheritance.singletable;

import org.com.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {

	public static void main(String[] args) {
		
		 SessionFactory sf1=HibernateUtil.getSF();
		 Session session=sf1.openSession();
		 Transaction transaction=session.beginTransaction();

		  CreditCardPayment cardPayment=new CreditCardPayment(20000);
		  CashPayment cashPayment=new CashPayment(40000);		 
		 
		 transaction.begin();
		 session.save(cardPayment);
		 session.save(cashPayment);
		 
		 transaction.commit();
		 System.out.println("payment done");
		 session.close();
		 sf1.close();
		
	}
}
