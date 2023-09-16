package com.coforge.main;

import org.hibernate.Session;

import com.coforge.model.one_to_one_uni.Kid;
import com.coforge.model.one_to_one_uni.Toy;

public class KidMain {

	public static void main(String[] args) {
	
		Session session = MySessionFactoryUtil.getSessionFactory().openSession();
	
	    Kid kid=new Kid();
	    Toy toy=new Toy();
	    
	    toy.setToyColor("red");
	    toy.setToyCost(400.0f);
	    toy.setToyName("drum master");
	    
	    
	    kid.setAge(6);
	    kid.setName("munnu kumar");
	    kid.setToy(toy);
	    
	    session.getTransaction().begin();
	    
	    // without cascading
	    session.save(toy);
	    session.save(kid);

	    // with cascading
	    session.save(kid);
	    
	    session.getTransaction().commit();
	    
	    session.createQuery("from Kid").list().forEach(System.out::println);
	
	    System.out.println();
	    session.createQuery("from Toy").list().forEach(System.out::println);
	    
	    
	}
}
