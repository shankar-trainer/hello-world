package com.conforge.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.conforge.model.onetoone.Order;
import com.conforge.model.onetoone.Payment;
import com.conforge.model.onetoone.Product;
import com.conforge.util.SessionFactoryUtil;

public class OneToOneUni_ProductMain_Cascade {

	public static void main(String[] args) {
		
		SessionFactory factory=SessionFactoryUtil.getSessionFactory();
		
		Session session=factory.openSession();
		Transaction transaction=session.getTransaction();
		
		Product product=new Product();
		product.setProductName("shoe");
		product.setProductCost(900);
		product.setQuantity(50);
		
		Order order=new Order();
		order.setOrderLocation("noida");
		order.setTotalCost(product.getProductCost()*product.getQuantity());
		
		
		Payment payment=new  Payment();
		payment.setPaymentMode("cash");
		payment.setPaymentTotal(order.getTotalCost());
		product.setOrder(order);
		product.setPayment(payment);
		
		transaction.begin();
		//session.save(order);// due to cascade no need to save 
		//session.save(payment);
		System.out.println("payment added is "+payment);
		
		session.save(product);
		transaction.commit();
	
		List<Product> list1 = session.createQuery("from Product").list();
		
		//list1.forEach(System.out::println);
		System.out.println("product size is "+list1.size());
		
		for(Product p:list1) {
			System.out.println("product ");
			System.out.println(p.getProductId()+"\t"+p.getProductName()+"\t"+p.getProductCost()+"\t"+p.getQuantity());
			
			System.out.println("order ");
			Order o=p.getOrder();
			
			System.out.println(o.getOrderId()+"\t"+o.getOrderLocation()+"\t"+o.getTotalCost());
			
			System.out.println("payment ");
			Payment payment1=p.getPayment();
			System.out.println(" payment is now "+payment1);
			
			System.out.println(payment1.getPaymentId()+"\t"+payment1.getPaymentMode()+"\t"+payment1.getPaymentTotal());
		}
		transaction.begin();
		//session.delete(order);
		//session.delete(payment);
		session.delete(product);
		transaction.commit();
		
		System.out.println("completed ");
		
		
	}
}
