package com.cts;

public class Customer {

	private int id;
	private String name;

	/*@Override
	public boolean equals(Object obj) {
		boolean status = false;
		
		if (obj instanceof Customer) {
                Customer customer=(Customer) obj;			
                
			if (this.id == customer.id  && this.name==customer.name) {
				status = true;
			}
			return status;
		} else
			return status;
	}
*/
	

	public static void main(String[] args) {

		Customer customer1 = new Customer();
		Customer customer2 = new Customer();

		customer1.id = 999;
		customer1.name = "ram kumar";

		customer2.id = 999;
		customer2.name = "ram kumar";

		if (customer1.equals(customer2))
			System.out.println("equals");
		else
			System.out.println("not equals");

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
