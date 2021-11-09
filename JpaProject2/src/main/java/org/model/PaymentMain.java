package org.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PaymentMain {

	public static void main(String[] args) {
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("manager1");
		EntityManager manager = managerFactory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		CashPayment cashPayment = new CashPayment();
		CardPayment cardPayment = new CardPayment();
		ChequePayment chequePayment = new ChequePayment();

		cashPayment.setPaymentAmt(120000);
		cardPayment.setPaymentAmt(10000);
		chequePayment.setPaymentAmt(9000);
		
		cashPayment.setPaymentLocation("delhi");
		cardPayment.setPaymentLocation("noida");
		chequePayment.setPaymentLocation("gurgaon");
		
		

		transaction.begin();
		manager.persist(cashPayment);
		manager.persist(cardPayment);
		manager.persist(chequePayment);
		transaction.commit();

		System.out.println("done ");

	}
}
