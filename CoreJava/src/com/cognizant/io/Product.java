package com.cognizant.io;

import java.io.Serializable;

public class Product  implements Serializable{

transient	int productId;
	String  productName;
	float productCost;
	
	static String location="delhi"; 
	
}
