package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by shankar on 4/6/2023.
 */

@Entity
@Data
@AllArgsConstructor
public class Passenger {
    @Id
  private int passengerId;
  private String passengerName;
  private int  passengerAge;

}
