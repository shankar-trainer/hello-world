package com.cognizant.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ProductProgramWrite {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("product.txt"));

		Product prd1 = new Product();

		prd1.productId = 67677878;
		prd1.productName = "apple";
		prd1.productCost = 200;

		prd1.location="madurai";
		
		Product prd2 = new Product();

		prd2.productId = 67677879;
		prd2.productName = "mobile";
		prd2.productCost = 5000;
		
		prd2.location="chennai";
		

		objectOutputStream.writeObject(prd1);
		objectOutputStream.writeObject(prd2);

		objectOutputStream.close();

	}

}
