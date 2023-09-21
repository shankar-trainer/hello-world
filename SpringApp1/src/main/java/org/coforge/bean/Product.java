package org.coforge.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Data;

@Data
public class Product {
   private int prdId;
   private String prdName;
   private float prdCost;
   
   private List<String> prdList;
   private Set<String> bikeSet;
   
   private Map<String,String> carMap;
   
   
}
