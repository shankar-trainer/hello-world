package com.audintel.collection;

import java.util.Date;

public class PurchaseOrder {

	private long purchaseOrderId; 
	private String purchaseOrderName; 
	private double purchaseOrderCost; 
	private Date purchaseOrderDate;
	
	public long getPurchaseOrderId() {
		return purchaseOrderId;
	}
	public void setPurchaseOrderId(long purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}
	public String getPurchaseOrderName() {
		return purchaseOrderName;
	}
	public void setPurchaseOrderName(String purchaseOrderName) {
		this.purchaseOrderName = purchaseOrderName;
	}
	public double getPurchaseOrderCost() {
		return purchaseOrderCost;
	}
	public void setPurchaseOrderCost(double purchaseOrderCost) {
		this.purchaseOrderCost = purchaseOrderCost;
	}
	public Date getPurchaseOrderDate() {
		return purchaseOrderDate;
	}
	public void setPurchaseOrderDate(Date purchaseOrderDate) {
		this.purchaseOrderDate = purchaseOrderDate;
	} 
	
	
}
