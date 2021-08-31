package com.abc.model;

import java.sql.Time;
import java.util.Date;

public class ProductOrder {

	private int prdId;

	private int orderId;

	private String cname;
	private String prdType;
	private String prdColor;
	private int qty;
	private float buyPrice;
	private float sellPrice;
	private Date saleDate;
	private Time time;

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public int getPrdId() {
		return prdId;
	}

	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getPrdType() {
		return prdType;
	}

	public void setPrdType(String prdType) {
		this.prdType = prdType;
	}

	public String getPrdColor() {
		return prdColor;
	}

	public void setPrdColor(String prdColor) {
		this.prdColor = prdColor;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public float getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(float buyPrice) {
		this.buyPrice = buyPrice;
	}

	public float getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(float sellPrice) {
		this.sellPrice = sellPrice;
	}

	public Date getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}

}
