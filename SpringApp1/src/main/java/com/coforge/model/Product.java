package com.coforge.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Data;

@Data
public class Product {
	private int productId;
	private String productName;
	
	private String productLocation[];
	
	private List<String> listItem;
	private Set<String> setProductName;
	
	private Map<Integer,String> productMap;
	
	
	private Order productOrder;
	
}
