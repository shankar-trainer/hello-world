package com.capegemini.collection;

import java.util.ArrayList;
import java.util.List;

public class InsuranceDao {

	List<Insurance> list1;

	public InsuranceDao() {
		list1 = new ArrayList<Insurance>();
	}
	
	public void insuranceAdd(Insurance insurance){
		list1.add(insurance);
	}

	public Insurance insuranceSearch(Insurance insurance){
		if(list1.contains(insurance)){
			for (Insurance insurance1 : list1) {
				if(insurance1==insurance)
					return insurance1;
			}
		}
		return null;
	}

	public void insuranceRemove(Insurance insurance){
		list1.remove(insurance);
	}
		
	public List<Insurance> getAllInsurance(){
		return list1;
	}
}
