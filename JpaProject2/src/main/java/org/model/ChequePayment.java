package org.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue(value = "cheque")
public class ChequePayment extends Payment {

}
