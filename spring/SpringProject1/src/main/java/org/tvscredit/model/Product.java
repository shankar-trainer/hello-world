package org.tvscredit.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Product {
	private int prdId;
	private String prdLocation;
	private List<String> bikeList;
	private Set<String> grocerySet;
	private Map<Integer, Customer> customerMap;

	public Map<Integer, Customer> getCustomerMap() {
		return customerMap;
	}
	public void setCustomerMap(Map<Integer, Customer> customerMap) {
		this.customerMap = customerMap;
	}
	
	public int getPrdId() {
		return prdId;
	}
	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}
	public String getPrdLocation() {
		return prdLocation;
	}
	public void setPrdLocation(String prdLocation) {
		this.prdLocation = prdLocation;
	}
	public List<String> getBikeList() {
		return bikeList;
	}
	public void setBikeList(List<String> bikeList) {
		this.bikeList = bikeList;
	}
	public Set<String> getGrocerySet() {
		return grocerySet;
	}
	public void setGrocerySet(Set<String> grocerySet) {
		this.grocerySet = grocerySet;
	}

	
}
