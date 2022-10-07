package com.montran.assignment.day3_3.material;

import com.montran.assignment.day3_3.stock.Inventory;

public class Laptops extends Inventory {
	private int uniqueId;
	private String description;

	public Laptops(int quantity, int lowOrderLevelQuantity, int uniqueId, String description) {
		super(quantity, lowOrderLevelQuantity);
		this.uniqueId = uniqueId;
		this.description = description;
	}

	public int getUniqueId() {
		return uniqueId;
	}

	public String getDescription() {
		return description;
	}
}

class Accessories extends Inventory {
	private int uniqueId;
	private String description;

	public Accessories(int quantity, int lowOrderLevelQuantity, int uniqueId, String description) {
		super(quantity, lowOrderLevelQuantity);
		this.uniqueId = uniqueId;
		this.description = description;
	}

	public int getUniqueId() {
		return uniqueId;
	}

	public String getDescription() {
		return description;
	}
}

class Order {
	public static void main(String[] args) {
		Laptops laptops[] = new Laptops[5];
		Accessories accessories[] = new Accessories[10];

		laptops[0] = new Laptops(10, 3, 87878787, "hp laptop");
		accessories[0] = new Accessories(20, 5, 878787, "accessories for laptop");

		if (laptops[0].getQuantity() >= laptops[0].getLowOrderLevelQuantity()) {
			System.out.println("invoice is generated");
			System.out.println(
					laptops[0].getUniqueId() + "  " + laptops[0].getDescription() + "  " + laptops[0].getQuantity());
		} else {
			System.out.println("laptops RFM (Request For Material ) is generated");
		}

// lowOrderLevelQuantity  -- laptops -- 3
// lowOrderLevelQuantity  -- accessories -- 5

	}
}