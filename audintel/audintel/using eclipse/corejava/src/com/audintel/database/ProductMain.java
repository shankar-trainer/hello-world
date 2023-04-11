package com.audintel.database;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {

		String ch = "y";
		Scanner sc = new Scanner(System.in);
		Product prd;
		try {
			ProductDao dao = new ProductDao();
			while (ch.equals("y")) {
				System.out.println("1.Add Product");
				System.out.println("2.Show All Product");
				System.out.println("3.Search By Id ");
				System.out.println("4.Display Max Min Average and Total Cost");

				int choice = sc.nextInt();
				switch (choice) {
				case 1: {
					prd = null;
					prd = new Product();
					System.out.println("Enter product id name cost");
					prd.setPrdId(sc.nextLong());
					sc.nextLine();
					prd.setPrdName(sc.nextLine());
					prd.setPrdCost(sc.nextFloat());
					try {
						System.out.println("Product added is " + dao.addProduct(prd));
					} catch (SQLIntegrityConstraintViolationException e) {
						System.err.println(e.getMessage());
					}
					break;
				}

				case 2: {
					System.out.println("\n");
					for (String s : dao.getAllColumnName())
						System.out.print(s + "\t");

					System.out.println();
					for (Product p : dao.getAllProduct())
						System.out.println(p.getPrdId() + "\t" + p.getPrdName() + "\t" + p.getPrdCost());
					break;
				}

				case 3: {
					System.out.println("Enter product id");
					prd = null;
					// prd = dao.searchByProductId(sc.nextInt());
					prd = dao.searchByProductId1(sc.nextInt());
					if (prd == null)
						System.out.println("not found ");
					else {
						System.out.println("found ");
						System.out.println("\n");
						for (String s : dao.getAllColumnName())
							System.out.print(s + "\t");
						System.out.println("\n");
						System.out.println(prd.getPrdId() + "\t" + prd.getPrdName() + "\t" + prd.getPrdCost());
					}
					break;
				}
				case 4: {
					String ar[] = { "Max", "Min", "Average", "Total" };
					int index = 0;
					for (String s : dao.getMaxMinAvgTotalCost()) {
						System.out.println(ar[index] + " Cost is " + s);
						index++;
					}
					break;
				}
				default:
					System.err.println("wrong operation try again!!!");
				}
				System.out.println("continue y\\n");
				ch = sc.next();
			}
		} catch (SQLException e) {
			System.err.println("Error is " + e.getMessage());
		}

	}
}
