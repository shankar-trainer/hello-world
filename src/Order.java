
public class Order {

	private int orderId;
	private String orderLocation;
	private float orderTotalCost;

	public void setOrderTotalCost(float orderTotalCost) {
		this.orderTotalCost = orderTotalCost;
	}

	public Order(int orderId, String orderLocation, float orderTotalCost) {
		super();
		this.orderId = orderId;
		this.orderLocation = orderLocation;
		this.orderTotalCost = orderTotalCost;
	}

	public int getOrderId() {
		return orderId;
	}

	public String getOrderLocation() {
		return orderLocation;
	}

	public float getOrderTotalCost() {
		return orderTotalCost;
	}

}
