package com.capgemini;


public class Product {
	int id;
	String name;

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Product) {
			Product p = (Product) obj;
			if (p.id == this.id && p.name.equals(this.name))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Product prd1 = new Product();// obj1
		Product prd2 = new Product();// obj2

		prd1.id = 100;
		prd2.id = 100;

		prd1.name = "biscuit";
		prd2.name = "biscuit";
		// .equals method of Object class checks reference
		System.out.println(prd1.equals(prd2));// .equals -- check references
	}

}
