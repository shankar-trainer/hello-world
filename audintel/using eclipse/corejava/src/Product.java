import java.util.Objects;

public class Product {
	private int prdId;
	private String prdName;
	private float prdCost;

	public Product(int prdId, String prdName, float prdCost) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
		this.prdCost = prdCost;
	}
	@Override
	public String toString() {
		return "Product [prdId=" + prdId + ", prdName=" + prdName + ", prdCost=" + prdCost + "]";
	}

	
	
	/*
	 * @Override public boolean equals(Object obj) { if (obj instanceof Product) {
	 * Product p1 = (Product) obj; if (p1.prdId == this.prdId && p1.prdName ==
	 * this.prdName && p1.prdCost == this.prdCost) return true; return false; }
	 * return super.equals(obj); }
	 */
	@Override
	public int hashCode() {
		return Objects.hash(prdCost, prdId, prdName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Float.floatToIntBits(prdCost) == Float.floatToIntBits(other.prdCost) && prdId == other.prdId
				&& Objects.equals(prdName, other.prdName);
	}
	
	public static void main(String[] args) {
		Product product1 = new Product(6776776, "Shoe", 2500);
		Product product2 = new Product(6776776, "Shoe", 2500);

		System.out.println(product1.equals(product2));
		System.out.println(product1.hashCode());
		System.out.println(product2.hashCode());
		

		// System.out.println(product1);
	}

}
