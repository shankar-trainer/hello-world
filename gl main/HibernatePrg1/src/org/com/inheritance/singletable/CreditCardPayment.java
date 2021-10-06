package org.com.inheritance.singletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("credit")
public class CreditCardPayment  extends Payment{

	public CreditCardPayment(long amount) {
		super(amount);	 
	}

}
