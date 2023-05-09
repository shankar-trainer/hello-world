package com.abc;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
public class Product {

	private int productId;
	private String  productName;
	private String productLocation;
	
	private  List<String> prdList; 
	private  Set<String> prdSet; 
	private  Map<Float,String> prdMap; 
	
}
