package com.capg.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capg.bean.unidir.one_to_one.Address;
import com.capg.bean.unidir.one_to_one.Student;

public class Uni_Dir_One_to_One_StudentMain {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sample");
		EntityManager em = emf.createEntityManager();
		
		  em.getTransaction().begin();
		 
		 Student student = new Student(); Address address = new Address();
		  student.setName("shyam kumar"); student.setSubject("science");
		  
		  address.setCity("sholapur"); address.setPin(977767);
		  student.setAddress(address);
		  //em.persist(address);// due to cascade it will be added 
		  em.persist(student);
		  
		  System.out.println("Record added"); em.getTransaction().commit();
		 
		// List<Student> slist=em.createQuery("from
		// Student",Student.class).getResultList();

		// for(Student st:slist)

		for (Student st : em.createQuery("from Student", Student.class).getResultList()) {
			System.out.println(st.getRoll() + "\t" + st.getName() + "\t" + st.getSubject());
			Address addr = st.getAddress();
			System.out.println("\t" + addr.getAddrId() + "\t" + addr.getCity() + "\t" + addr.getPin());
		}
		em.close();
		emf.close();

	}
}
