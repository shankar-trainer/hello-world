
//package org.com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.com.model.Leader;
import org.com.model.Work;

public class OneToManyMain2 {

	public static void main(String[] args) {
		EntityManagerFactory ef = Persistence.createEntityManagerFactory("prdonetoone");
		EntityManager em = ef.createEntityManager();
		EntityTransaction tr = em.getTransaction();

		Leader leader = new Leader();

		leader.setLeader_name("himanshu bhadoria");
		leader.setLeader_location("jaunpur");

		Work work[] = new Work[4];
		String wname[] = { "education", "health", "road", "water" };
		float wcost[] = { 1200000, 1500000, 500000, 100000 };

		List<Work> wlist = new ArrayList<>();
		for (int i = 0; i < work.length; i++) {
			work[i] = new Work();
			work[i].setWork_cost(wcost[i]);
			work[i].setWork_name(wname[i]);
			work[i].setLeader(leader);
			wlist.add(work[i]);
		}
		//leader.setList_work(wlist);

		tr.begin();
		for (Work work2 : wlist) {
			em.persist(work2);
		}
		em.persist(leader);
		

		em.createQuery("from Leader").getResultList().stream().forEach(System.out::println);
		
		tr.commit();
		System.out.println("Record added");

		ef.close();
	}
}
