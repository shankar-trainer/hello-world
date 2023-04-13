package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@DiscriminatorValue(value = "cash")
public class CashPayment extends Payment {

}
