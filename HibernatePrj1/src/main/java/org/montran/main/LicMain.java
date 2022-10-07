package org.montran.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.montran.model.Lic;
import org.montran.util.SessionFactoryUtil;

public class LicMain {

	public static void main(String[] args) {
		SessionFactory factory = SessionFactoryUtil.mySessionFactory();
		Session session = factory.openSession();

		Transaction tr = session.beginTransaction();

		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter Lic id ");
		Lic lic = new Lic();
		//lic.setLicId(scanner.nextInt());

		System.out.println("Enter Lic policy name ");
		//scanner.nextLine();
		lic.setLicPolicyName(scanner.nextLine());

		System.out.println("Enter Lic plan cost  name ");
		lic.setLicPolicyCost(scanner.nextFloat());

		//tr.begin();
		session.save(lic);
		tr.commit();
		System.out.println("record added");
		
		
		scanner.close();
		session.close();
		factory.close();

	}
}
