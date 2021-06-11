package com.cts.database.main;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.cts.database.dao.ProductDao;
import com.cts.database.model.Product;

public class ProductMain {

	public static void main(String[] args) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			ProductDao dao = new ProductDao();
			Scanner sc = new Scanner(System.in);

			String choice = "y";
			int s;
			while (choice.equalsIgnoreCase("y")) {
				System.out.println("1.Add Record");
				System.out.println("2.Show All  Record");
				System.out.println("3.Search  Record");
				
				s = sc.nextInt();

				switch (s) {
				case 1:
					Product product = new Product();
					System.out.println("Enter id ");
					product.setId(sc.nextInt());

					System.out.println("Enter Name ");
					sc.nextLine();
					product.setName(sc.nextLine());

					System.out.println("Enter cost ");
					product.setCost(sc.nextFloat());

					System.out.println("Enter date in dd-mm-yyyy format ");
					String s1 = sc.next();
					try {
						Date d1 = dateFormat.parse(s1);
						product.setMfd(d1);
					} catch (ParseException e) {
						System.out.println("date not in dd-mm-yyyy format");
					}
					
					if(dao.saveProduct(product)==true)
						System.out.println("Product added");

					break;
				case 2:
					for (Product p : dao.getAllProduct())
						System.out.println(p.getId() + "  " + p.getName() + " " + p.getCost() + " " + p.getMfd());
					break;
					
				case 3:
					System.out.println("Enter id ");
					int id=sc.nextInt();
					dao.searchProduct(id);
					
					break;

				default:
					System.out.println("wrong input ");
					break;
				}
				System.out.println("Continue y\\n");
				choice = sc.next();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
