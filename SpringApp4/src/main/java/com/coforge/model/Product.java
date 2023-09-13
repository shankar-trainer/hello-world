package com.coforge.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Component
@Data
@AllArgsConstructor
public class Product {
   private int prdId;
   private  String prdName;
   private  float prdCost;

}
