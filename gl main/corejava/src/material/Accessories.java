package material;

import collection.Main;
import stock.Inventory;

class Accessories extends Inventory {
	
	private int id;
	private String detail;
	
	public int getId() {
		return id;
	}
	public String getDetail() {
		return detail;
	}	 
	public Accessories(int id, String detail, int quantity) {
		super(quantity,5);
		
		this.id = id;
		this.detail = detail;
	}
}

class InventoryMain{
	
	public static void main(String[] args) {
		
		Laptops laptops[]=new Laptops[5];
		Accessories accessories[]=new Accessories[10];
		
		for (int i = 0; i < laptops.length; i++) {
			laptops[i]=new Laptops(0, "", laptops.length);
		}
		
		for (int i = 0; i < accessories.length; i++) {
			accessories[i]=new Accessories(0, "", accessories.length);
		}	
		Order order=new Order(4, 5);
		order.checkOrder(laptops[0].lowOrderLevelQuantity, accessories[0].lowOrderLevelQuantity);
		
	}
}