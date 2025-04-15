package com.packt.bestpractices.setup;

import java.util.Hashtable;

public class HRService {

	private Hashtable<String, Integer> employeeCountMap = new Hashtable<String, Integer>();

	public String generateUniqueIdFor(Employee emp) {
		Integer count = employeeCountMap.get(emp.getLastName());
		if (count == null) {
			count = 1;
		} else {
			count++;
		}
		employeeCountMap.put(emp.getLastName(), count);
		return emp.getLastName()+(count < 9 ? "0"+count :""+count);
	}
}
