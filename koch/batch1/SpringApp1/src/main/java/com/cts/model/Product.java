package com.cts.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Product {
	private int prdId;

	private List<String> groceryList;
	private Set<String> bookSet;
	private Map<Integer, String> mobileMap;

	public Product(int prdId, List<String> groceryList, Set<String> bookSet, Map<Integer, String> mobileMap) {
		super();
		this.prdId = prdId;
		this.groceryList = groceryList;
		this.bookSet = bookSet;
		this.mobileMap = mobileMap;
	}

	public int getPrdId() {
		return prdId;
	}

	public List<String> getGroceryList() {
		return groceryList;
	}

	public Set<String> getBookSet() {
		return bookSet;
	}

	public Map<Integer, String> getMobileMap() {
		return mobileMap;
	}

	@Override
	public String toString() {
		return "Product [prdId=" + prdId + ", groceryList=" + groceryList + ", bookSet=" + bookSet + ", mobileMap="
				+ mobileMap + "]";
	}

	

}
