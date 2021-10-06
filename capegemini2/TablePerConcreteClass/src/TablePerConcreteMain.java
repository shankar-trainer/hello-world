import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.com.model.CashPayment;
import org.com.model.ChequePayment;
import org.com.model.CreditCardPayment;
import org.com.model.Payment;

public class TablePerConcreteMain {

	public static void main(String[] args) {

		Payment payment=new Payment();
 		payment.setAmount(10000);
		
		CashPayment cashPayment=new CashPayment();
		cashPayment.setAmount(20000);
		cashPayment.setMode("cash");
		
		ChequePayment chequePayment=new ChequePayment();
		chequePayment.setAmount(25000);
		chequePayment.setMode("cheque");
		
		CreditCardPayment cardPayment=new CreditCardPayment();
		cardPayment.setAmount(4000);
		cardPayment.setMode("card");
		
		EntityManagerFactory ef = Persistence.createEntityManagerFactory("xyz");
		EntityManager em = ef.createEntityManager();
		EntityTransaction tr = em.getTransaction();

		tr.begin();
		em.persist(payment);
		em.persist(chequePayment);
		em.persist(cardPayment);
		em.persist(cashPayment);
		
		tr.commit();
		
		ef.close();
		
	}
}
