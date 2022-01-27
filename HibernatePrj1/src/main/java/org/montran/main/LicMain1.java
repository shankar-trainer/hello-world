package org.montran.main;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.montran.model.Lic;
import org.montran.util.SessionFactoryUtil;

public class LicMain1 {

	public static void main(String[] args) {
		SessionFactory factory = SessionFactoryUtil.mySessionFactory();
		Session session = factory.openSession();
		Lic lic = session.get(Lic.class, 100990);
		
		//Lic lic = session.load(Lic.class, 199989);
		if(lic!=null)
		   System.out.println(lic.getLicId()+"  "+lic.getLicPolicyName()+"   "+lic.getLicPolicyCost());
		else
			System.out.println("not found");
		
		System.out.println("all values");
		List<Lic> list = session.createQuery("from Lic").list();
		
		list.forEach(System.out::println);
		
		Lic lic2= (Lic) session.createQuery("from Lic where licId=1").uniqueResult();
		 
		System.out.println(lic2);
		
		session.close();
		factory.close();

	}
}
