
public class PizzaOrder extends Order {

	private float cost;
	private float rebate;

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public float getRebate() {
		return rebate;
	}

	public void setRebate(float rebate) {
		this.rebate = rebate;
	}

	@Override
	public void orderInfo() {
		System.out.println("Order Information ");
		System.out.println("id is " + getOrderId());
		System.out.println("name is " + getOrderName());
		System.out.println("location is " + getOrderLocation());
		
		System.out.println("cost  is "+cost);
		System.out.println("rebate  is "+rebate );
		System.out.println("gross cost  is "+(cost-cost*rebate));
	}

	public static void main(String[] args) {
		PizzaOrder order = new PizzaOrder();
		order.setOrderId(779898);
		order.setOrderName("pizza garlic ");
		order.setOrderLocation("madurai");
		order.setOrderId(779898);
		order.setCost(400);
		order.setRebate(0.1f);

		order.orderInfo();
	}

}
