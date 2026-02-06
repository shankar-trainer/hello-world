package com.cts.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Consumer {
    @Id
  private int consumerId;
  private String  consumerName;
  private float salary;

}
