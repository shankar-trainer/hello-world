package com.conforge.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.conforge.model.many_to_many.Order;
import com.conforge.model.many_to_many.Product;
import com.conforge.model.onetoone_bidirectional.Person;
import com.conforge.model.onetoone_bidirectional.Phone;
import com.conforge.util.SessionFactoryUtil;

public class manytomany_main {

	public static void main(String[] args) {
		Session session = SessionFactoryUtil.getSessionFactory().openSession();
		Transaction transaction = session.getTransaction();
		
		Set<Order> oset1=new HashSet<>();
		Set<Product> pset1=new HashSet<>();
		
		Product product1[]=new Product[4];
		product1[0]=new Product(10001, "mobile", 5000);
		product1[1]=new Product(10002, "note book", 300);
		product1[2]=new Product(10003, "shirt", 700);
		product1[3]=new Product(10004, "pant", 1500);
		
		for(Product p:product1)
			pset1.add(p);

		Order order[]=new Order[4];
		order[0]=new Order(1, "mobile order", "greater noida");
		order[1]=new Order(2, "note book order", "noida");
		order[2]=new Order(3, "shirt order", "kolkotta");
		order[3]=new Order(4, "pant order", "mombai");
			
		for (Order order2 : order) {
			oset1.add(order2);
		}
		
		
		Product product[]=new Product[3];
		
		product[0]=new Product();
		product[0].setPrdName("electronics product");
		product[0].setPrdCost(1500);
		product[0].setOrderSet(oset1);
		
		product[1]=new Product();
		product[1].setPrdName("garments  product");
		product[1].setPrdCost(2500);
		product[1].setOrderSet(oset1);
		
		product[2]=new Product();
		product[2].setPrdName("pharmaceutical product");
		product[2].setPrdCost(1200);
		product[2].setOrderSet(oset1);
		
		Order order2[]=new Order[3];
		
		order2[0]=new Order();
		order2[0].setOrderName("may 2023 order");
		order2[0].setOrderLocation("chennai");
		order2[0].setProductSet(pset1);
		
		order2[1]=new Order();
		order2[1].setOrderName("june 2023 order");
		order2[1].setOrderLocation("madurai");
		order2[1].setProductSet(pset1);
		
		order2[2]=new Order();
		order2[2].setOrderName("july ordeer");
		order2[2].setOrderLocation("kanchipuram");
		order2[2].setProductSet(pset1);
		
		transaction.begin();
		
		for(Order o:order2) {
			 System.out.println("order is----------------- "+o);
			session.save(o);
		}
		
		for(Product p:product)
			session.save(p);
		
		
		
		transaction.commit();
		
		
	}
}
