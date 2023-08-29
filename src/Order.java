
public class Order {
	private int orderId;
	private String orderLocation;
	private int orderPinCode;

	public Order(int orderId, String orderLocation, int orderPinCode) {
		super();
		this.orderId = orderId;
		this.orderLocation = orderLocation;
		this.orderPinCode = orderPinCode;
	}

	public int getOrderId() {
		return orderId;
	}

	public String getOrderLocation() {
		return orderLocation;
	}

	public int getOrderPinCode() {
		return orderPinCode;
	}

}
