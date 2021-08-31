package com.abc.model;

public class Product {

	private int prdId;
	private String cname;
	private String prdType;
	private String prdColor;
	private int qty;
	private float buyPrice;
	private float sellPrice;
	
	
	public String getPrdType() {
		return prdType;
	}
	public void setPrdType(String prdType) {
		this.prdType = prdType;
	}
	public int getPrdId() {
		return prdId;
	}
	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
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
	@Override
	public String toString() {
		return "Product [prdId=" + prdId + ", cname=" + cname + ", prdType="
				+ prdType + ", prdColor=" + prdColor + ", qty=" + qty
				+ ", buyPrice=" + buyPrice + ", sellPrice=" + sellPrice + "]";
	}
	
}
