package com.cts.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Phone {
  private String model;
  private  float  cost;
}
