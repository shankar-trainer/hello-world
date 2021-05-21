
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(prdCost);
		result = prime * result + prdId;
		result = prime * result + ((prdName == null) ? 0 : prdName.hashCode());
		return result;
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
		if (Float.floatToIntBits(prdCost) != Float.floatToIntBits(other.prdCost))
			return false;
		if (prdId != other.prdId)
			return false;
		if (prdName == null) {
			if (other.prdName != null)
				return false;
		} else if (!prdName.equals(other.prdName))
			return false;
		return true;
	}

}
