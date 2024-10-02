package com.coforge.model;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
public class Product {
 private int prdId;
 private  String prdName;
 private  float  prdCost;

 private List<String> locationList;
 private Set<String> modelSet;
 private Map<Integer,String> stateMap;


}
