package com.coforge.model;

import lombok.Data;

@Data
public class Account {
  private long accountId;
  private String accountHolderName;
  private float balance;
}
