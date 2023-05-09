package com.nec.exception;

public class CustomerClient {

	public static void main(String[] args) {
		
		Customer customer=new Customer();
		try {
		//customer.setId(0);
	      customer.setId(10000);
		customer.setName("ram kumar");
		customer.setSalary(50000);
		
		
		System.out.println("customer details ");
		
		System.out.println("id is "+customer.getId());
		System.out.println("name is "+customer.getName());
		System.out.println("salary is "+customer.getSalary());
		}
		catch (CustomerException e) {
			System.err.println(e.getMessage());
		}
		
	}
	
}
