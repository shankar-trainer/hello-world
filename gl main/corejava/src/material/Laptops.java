package material;

import stock.Inventory;

class Laptops extends Inventory {
	private int id;
	private String detail;
	
	
	public int getId() {
		return id;
	}

	public String getDetail() {
		return detail;
	}
 
	public Laptops(int id, String detail, int quantity) {
		super(quantity,3);
		this.id = id;
		this.detail = detail;
	}
	
	
}