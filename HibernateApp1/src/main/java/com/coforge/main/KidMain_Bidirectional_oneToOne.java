package com.coforge.main;

import java.util.List;

import org.hibernate.Session;

import com.coforge.model.one_to_one_uni.Kid;
import com.coforge.model.one_to_one_uni.Toy;

public class KidMain_Bidirectional_oneToOne {

	public static void main(String[] args) {
		// one to one bi directional

		Session session = MySessionFactoryUtil.getSessionFactory().openSession();

		Kid kid = new Kid();
		Toy toy = new Toy();

		toy.setToyColor("red");
		toy.setToyCost(400.0f);
		toy.setToyName("drum master");

		kid.setAge(6);
		kid.setName("munnu kumar");

		toy.setKid(kid);
		// kid.setToy(toy);

		session.getTransaction().begin();

		// with cascading
		session.save(toy);
		// session.save(kid);

		session.getTransaction().commit();

		 session.createQuery("from Toy").list().forEach(System.out::println);
		 
		 // bi directional   toy to kid direction 
		 // uni direction -- kid -- to toy
		 
		 
		List<Toy> listoftoy = session.createQuery("from Toy").list();
        for(Toy t:listoftoy) {
        	System.out.println("toy "+t.getToyId()+"\t "+t.getToyName()+"\t"+t.getToyCost()+"\t"+t.getToyColor());
        	Kid k=t.getKid();
        	System.out.println("kid "+k.getId()+"\t"+k.getName()+"\t"+k.getAge());
        } 
		
	}
}
