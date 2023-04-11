package com.nec.collection;

import java.util.Arrays;

public class PersonMain {

	 static void displayData(Person per[]) {
		 
	        System.out.println("\nPerson data");
	        for(Person p:per) {
	        System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getSalary());
	        }
		 
	 }
	
	public static void main(String[] args) {
		
		Person person[]=new Person[4];
		
		int id[] = { 1001, 1004, 1003, 1002 };

		String name[] = { "suresh kumar", "priyansh kumar", "javed akhtar", "salim khan" };
		float salary[] = { 23000, 90000, 78000, 67000 };

        for (int i = 0; i < salary.length; i++) {
			 person[i]=new Person();
			 person[i].setId(id[i]);
			 person[i].setName(name[i]);
			 person[i].setSalary(salary[i]);
		}

        System.out.println("Before sorting ");
        displayData(person);

        
        Arrays.sort(person);
        System.out.println("\nsorted by id ");
        displayData(person);

		
	}
}
