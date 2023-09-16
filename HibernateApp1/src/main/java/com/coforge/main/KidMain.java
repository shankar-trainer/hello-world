package com.coforge.main;

import org.hibernate.Session;

import com.coforge.model.one_to_one_uni.Kid;
import com.coforge.model.one_to_one_uni.Toy;

public class KidMain {

	public static void main(String[] args) {
	
		Session session = MySessionFactoryUtil.getSessionFactory().openSession();
	
	    Kid kid=new Kid();
	    Toy toy=new Toy();
	    
	    toy.setToyColor("yellow");
	    toy.setToyCost(12000f);
	    toy.setToyName("monkey and donkey");
	    
	    
	    kid.setAge(6);
	    kid.setName("chunnu kumar");
	    kid.setToy(toy);
	    
	    session.getTransaction().begin();
	    
	    session.save(toy);
	    session.save(kid);
	    
	    session.getTransaction().commit();
	    
	    session.createQuery("from Kid").list().forEach(System.out::println);
	
	    System.out.println();
	    session.createQuery("from Toy").list().forEach(System.out::println);
	    
	    
	}
}
