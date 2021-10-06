package org.com.inheritance.singletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("cash")
public class CashPayment  extends Payment{

	public CashPayment(long amount) {
		super(amount);	 
	}

}
