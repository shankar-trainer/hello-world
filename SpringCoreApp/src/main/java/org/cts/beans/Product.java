package org.cts.beans;

public class Product {

	private int product_Pd;
	private String  product_Name;
	private float product_Cost;
	
	public int getProduct_Pd() {
		return product_Pd;
	}
	public void setProduct_Pd(int product_Pd) {
		this.product_Pd = product_Pd;
	}
	public String getProduct_Name() {
		return product_Name;
	}
	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}
	public float getProduct_Cost() {
		return product_Cost;
	}
	public void setProduct_Cost(float product_Cost) {
		this.product_Cost = product_Cost;
	}
	
	
	@Override
	public String toString() {
		return "Product [product_Pd=" + product_Pd + ", product_Name=" + product_Name + ", product_Cost=" + product_Cost
				+ "]";
	}

	
}
