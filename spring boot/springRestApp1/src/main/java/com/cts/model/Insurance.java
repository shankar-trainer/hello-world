package com.cts.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Insurance {
  private int insuranceId;
  private  String  insuranceName;
  private LocalDate insuranceMaturityDate;
  private float  insuranceMaturityAmount;

}
