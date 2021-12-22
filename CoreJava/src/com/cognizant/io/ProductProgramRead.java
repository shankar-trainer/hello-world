package com.cognizant.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ProductProgramRead {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("product.txt"));

		Product prd = (Product) inputStream.readObject();
		
		System.out.println("product1 ");
		System.out.println(prd.productId);
		System.out.println(prd.productName);
		System.out.println(prd.productCost);
		System.out.println(prd.location);

		prd = (Product) inputStream.readObject();

		System.out.println("\nproduct2 ");
		System.out.println(prd.productId);
		System.out.println(prd.productName);
		System.out.println(prd.productCost);
		System.out.println(prd.location);
		inputStream.close();

	}
}
