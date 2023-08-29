
public class Product {

	private long prdId;
	private String prdName;
	private float prdCost;
	private int prdCount;

	private Order order;

	public Product(long prdId, String prdName, float prdCost, int prdCount, Order order) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
		this.prdCost = prdCost;
		this.prdCount = prdCount;
		this.order = order;
	}

	public long getPrdId() {
		return prdId;
	}

	public String getPrdName() {
		return prdName;
	}

	public float getPrdCost() {
		return prdCost;
	}

	public int getPrdCount() {
		return prdCount;
	}

	public Order getOrder() {
		return order;
	}

	public void productDetail() {
		System.out.println("product details ");
		System.out.println("\tid "+getPrdId());
		System.out.println("\tname "+getPrdName());
		System.out.println("\tcost "+getPrdCost());
		System.out.println("\tcount  "+getPrdCount());
		
		System.out.println("\n Order Detail ..");
 		
		Order order1=getOrder();
		
		System.out.println("\tid "+getOrder().getOrderId());
		System.out.println("\tlocation "+order1.getOrderLocation());
		System.out.println("\tcost "+order1.getOrderTotalCost());
	}
	
}
