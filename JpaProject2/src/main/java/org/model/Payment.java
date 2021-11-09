package org.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "type")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int paymentId;
	private float paymentAmt;

	public float getPaymentAmt() {
		return paymentAmt;
	}

	public void setPaymentAmt(float paymentAmt) {
		this.paymentAmt = paymentAmt;
	}

	private String paymentLocation;

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentLocation() {
		return paymentLocation;
	}

	public void setPaymentLocation(String paymentLocation) {
		this.paymentLocation = paymentLocation;
	}

}
