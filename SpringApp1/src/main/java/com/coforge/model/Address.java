package com.coforge.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Address {
  private int addrId;
  private String city;
  private String state;
  
}
