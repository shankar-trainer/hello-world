
public class Furniture {

	private int id;// this.id
	private String name;
	private float cost;

	public Furniture() {
		System.out.println("constructor called");
		id = 10001;
		name = "chair";
		cost = 1200;
	}

	public Furniture(int id, String name, float cost) {
		System.out.println("overloaded constructor called");
		this.id = id;// this keyword refers current class reference
		this.name = name;
		this.cost = cost;
	}

	float total = 0;

	public void  totalCost(Furniture f) {
		total = f.getCost() + total;
		//System.out.println(f.getCost()+" total cost ... "+total);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getCost() {
		return cost;
	}

}
