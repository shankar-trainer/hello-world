package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name = "type",discriminatorType = DiscriminatorType.STRING)
public class Payment {

    @Id
    private long paymentId;
    private float paymentAmt;
    private String paymentUserName;




}
