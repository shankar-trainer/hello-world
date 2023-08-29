
public class Product {
	private int prdId;
	private String prdName;
	private float prdCost;
	private Order order; // composition has a relationship
							// Product has order

	public Product(int prdId, String prdName, float prdCost, Order order) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
		this.prdCost = prdCost;
		this.order = order;
	}

	public int getPrdId() {
		return prdId;
	}

	public String getPrdName() {
		return prdName;
	}

	public float getPrdCost() {
		return prdCost;
	}

	public Order getOrder() {
		return order;
	}

}
