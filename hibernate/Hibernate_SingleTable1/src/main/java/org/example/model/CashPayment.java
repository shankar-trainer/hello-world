package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@DiscriminatorValue(value = "cash")
public class CashPayment extends Payment {

    public CashPayment(long paymentId, float paymentAmt, String paymentUserName) {
        super(paymentId, paymentAmt, paymentUserName);
    }
}
