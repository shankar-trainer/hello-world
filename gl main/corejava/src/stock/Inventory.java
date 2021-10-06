package stock;

public class Inventory {
public	int quantity;
public	int lowOrderLevelQuantity;

	public Inventory(int quantity, int lowOrderLevelQuantity) {
		super();
		this.quantity = quantity;
		this.lowOrderLevelQuantity = lowOrderLevelQuantity;
	}
}