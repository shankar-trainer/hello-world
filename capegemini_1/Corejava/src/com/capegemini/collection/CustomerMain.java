package com.capegemini.collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CustomerMain {

	public static void main(String[] args) {
		int id[] = { 1001, 1009, 107, 1008, 1003 };
		String name[] = { "ram kumar", "suresh kumar", "aman kumar",
				"mahesh kumar", "amrendra kumar" };
		float sal[] = { 45000, 78000, 67000, 34000, 90000 };
		String loc[] = { "chennai", "delhi", "kolkotta", "pune", "coimbtore" };

		CustomerDao customerDao = new CustomerDao();
		Customer customer[] = new Customer[5];

		for (int i = 0; i < customer.length; i++) {
			customer[i] = new Customer(id[i], name[i], sal[i], loc[i]);
			customerDao.addCustomer(customer[i]);
		}

	boolean status=	customerDao.removeCustomer(100398);
		if(status)
			System.out.println("Id found and removed");
		else
			System.out.println("Id not present");
		
		System.out.println("All Customer Records");
		Map<Integer, Customer> customer_map = customerDao.
				getAllCustomer();
		System.out.println("using entryset ");
		
	 Set<Entry<Integer, Customer>>  entryset=customer_map.entrySet();
		
	 for (Entry<Integer, Customer> entry : entryset) {
		int id1=entry.getKey();
		Customer cst=entry.getValue();
		System.out.println(id1+" "+cst.getCust_Name()+"  "
				+ "   "+cst.getCust_Salary()+"  "+cst.getLocation());
	}
	 
		
		System.out.println("using keyset");
		Set<Integer> key = customer_map.keySet();
		for (Integer i : key) {
			Customer c = customer_map.get(i);

			System.out.println(c.getCust_Id() + " " + c.getCust_Name() + " "
					+ c.getCust_Salary() + "  " + c.getLocation());
		}

		
		Customer customer2=  customerDao.searchCustomer(10789);
		if(customer2==null)
			System.out.println("Id not present");
		else
		{
			System.out.println("Id found ");
System.out.println(customer2.getCust_Id()+" "+customer2.getCust_Name()+" "+customer2.getCust_Salary()+"  "+customer2.getLocation());
		}
	}
}
