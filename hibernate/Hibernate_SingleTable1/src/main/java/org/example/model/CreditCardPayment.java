package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@DiscriminatorValue(value = "credit")
public class CreditCardPayment extends   Payment {

    public CreditCardPayment(long paymentId, float paymentAmt, String paymentUserName) {
        super(paymentId, paymentAmt, paymentUserName);
    }
}
