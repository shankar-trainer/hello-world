package com.abc.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Product {

	private int productId;
	private  String productName;
	private float productCost;
	
	private List<String> bookList;
	private Set<String> mobileSet;
	
	private Map<Integer,String> shoeMap;
	
	public List<String> getBookList() {
		return bookList;
	}
	public void setBookList(List<String> bookList) {
		this.bookList = bookList;
	}
	public Set<String> getMobileSet() {
		return mobileSet;
	}
	public void setMobileSet(Set<String> mobileSet) {
		this.mobileSet = mobileSet;
	}
	public Map<Integer, String> getShoeMap() {
		return shoeMap;
	}
	public void setShoeMap(Map<Integer, String> shoeMap) {
		this.shoeMap = shoeMap;
	}

	// has a relationship   Product has Order 
	private Order order;
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getProductCost() {
		return productCost;
	}
	public void setProductCost(float productCost) {
		this.productCost = productCost;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost
				+ ", bookList=" + bookList + ", mobileSet=" + mobileSet + ", shoeMap=" + shoeMap + ", order=" + order
				+ "]";
	}
	
	
	
}
