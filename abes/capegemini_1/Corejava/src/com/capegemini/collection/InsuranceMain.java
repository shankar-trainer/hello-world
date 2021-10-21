package com.capegemini.collection;

import java.util.List;

public class InsuranceMain {
	public static void main(String[] args) {
		
		Insurance insurance1=new Insurance(1001, "jeevan beema", 20000);
		Insurance insurance2=new Insurance(2341, "bal jeevan beema", 34000);
		Insurance insurance3=new Insurance(5451, "education jeevan beema", 50000);
		Insurance insurance4=new Insurance(1241, "sawaran jeevan beema", 120000);
		Insurance insurance5=new Insurance(1671, "balika jeevan beema", 220000);
		
		InsuranceDao dao=new InsuranceDao();
		dao.insuranceAdd(insurance1);
		dao.insuranceAdd(insurance2);
		dao.insuranceAdd(insurance3);
		dao.insuranceAdd(insurance4);
		dao.insuranceAdd(insurance5);
		
		System.out.println("All Insurance Objects  ");
		
		dao.insuranceRemove(insurance3);
		
	    List<Insurance> allInsurance = dao.getAllInsurance();
		
	    for (Insurance insurance : allInsurance) {
			System.out.println(insurance);
		}
	    
	    Insurance insurance=dao.insuranceSearch(insurance3);
	    if(insurance==null)
	    	 System.out.println("not present");
	    else{
	    	System.out.println("present "+insurance);
	    }
	    
			
	}
}
