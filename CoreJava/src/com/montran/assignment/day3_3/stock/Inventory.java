package com.montran.assignment.day3_3.stock;

public class Inventory {

	private int quantity;
	private int lowOrderLevelQuantity;
	public Inventory(int quantity, int lowOrderLevelQuantity) {
		super();
		this.quantity = quantity;
		this.lowOrderLevelQuantity = lowOrderLevelQuantity;
	}
	public int getQuantity() {
		return quantity;
	}
	public int getLowOrderLevelQuantity() {
		return lowOrderLevelQuantity;
	}
	
	
	
}
