package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Payment {
	//@Column
	private String paymentMethod;
	//@Column
	private long cardnumber;
	//@Column
	private int expmonth;
	//@Column
	private int expyear;
	//@Column
	private int cvc;
	
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(long cardnumber, int expmonth, int expyear, int cvc) {
		super();
		this.cardnumber = cardnumber;
		this.expmonth = expmonth;
		this.expyear = expyear;
		this.cvc = cvc;
	}

	public long getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(long cardnumber) {
		this.cardnumber = cardnumber;
	}

	public int getExpmonth() {
		return expmonth;
	}

	public void setExpmonth(int expmonth) {
		this.expmonth = expmonth;
	}

	public int getExpyear() {
		return expyear;
	}

	public void setExpyear(int expyear) {
		this.expyear = expyear;
	}

	public int getCvc() {
		return cvc;
	}

	public void setCvc(int cvc) {
		this.cvc = cvc;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cardnumber ^ (cardnumber >>> 32));
		result = prime * result + cvc;
		result = prime * result + expmonth;
		result = prime * result + expyear;
		return result;
	}

	@Override
	public String toString() {
		return "Payment [cardnumber=" + cardnumber + ", expmonth=" + expmonth + ", expyear=" + expyear + ", cvc=" + cvc
				+ "]";
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

}
