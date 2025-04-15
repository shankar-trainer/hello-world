package org.audintel.model;

import lombok.Data;

@Data
public class Address {
  private long addrId;
  private String addrStreet;
  private String addrCity;
  private long addrPin;
  private String addrState;
}
