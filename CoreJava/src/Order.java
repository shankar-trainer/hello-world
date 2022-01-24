
public class Order {

	private int orderId;
	private String orderName;
	private String orderLocation;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderLocation() {
		return orderLocation;
	}

	public void setOrderLocation(String orderLocation) {
		this.orderLocation = orderLocation;
	}

	public void orderInfo() {
		System.out.println("Order Information ");
		System.out.println("id is " + getOrderId());
		System.out.println("name is " + getOrderName());
		System.out.println("location is " + getOrderLocation());
	}

}
