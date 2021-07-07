
public class Bag {

	private int bagId;
	private String bagModel;
	private float bagCost;
	
	@Override
	protected void finalize() throws Throwable {
	   System.out.println("finalise called  ");
	}
	
	public Bag(int bagId, String bagModel, float bagCost) {
		super();
		this.bagId = bagId;
		this.bagModel = bagModel;
		this.bagCost = bagCost;
	}

	@Override
	public String toString() {
		return "Bag [bagId=" + bagId + ", bagModel=" + bagModel + ", bagCost=" + bagCost + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Bag) {
			Bag bag = (Bag) obj;
			if (this.bagId == bag.bagId && this.bagCost == bag.bagCost && this.bagModel == bag.bagModel)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {

		Bag bag1 = new Bag(6576, "synthetic", 500);
		Bag bag2 = new Bag(6576, "synthetic", 500);
		System.out.println(bag1);
		System.out.println(bag1.hashCode());
		System.out.println(bag2.hashCode());

		System.out.println(bag1.equals(bag2));
		bag1=null;
		System.gc();
		
	}
}
