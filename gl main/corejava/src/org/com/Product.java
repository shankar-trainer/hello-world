package org.com;

public class Product {

	int prd_id;
	String pname;
	float cost;
	
	@Override
	public String toString() {
		return "Product Information +"
				+ "\n\tPrd id "+prd_id
				+ "\n\tPrd name "+pname
				+"\n\tcost "+cost;
	}
	
	
	public static void main(String[] args) {
	
		Product product=new Product();
		product.prd_id=1001;
		product.pname="my book";
		product.cost=789f;
		
		System.out.println(product);
		
		//toString getClass().getName() + "@" + Integer.toHexString(hashCode());
		
		System.out.println(product.hashCode());
	}
	
}
