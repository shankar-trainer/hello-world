package org.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue(value = "cash")
public class CashPayment extends Payment {

}
