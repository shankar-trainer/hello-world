package corejava;

public class WaterBottle {

	private int id;
	private String type;
	private float cost;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	{
		this.id=10001;
		this.type="plastic bottle";
		this.cost=200;
		System.out.println("init block 1");
	}


	public WaterBottle() {
		System.out.println("constructor");
		this.id=10003;
		this.type="glass bottle";
		this.cost=500;
	}
	
	{
		this.id=10002;
		this.type="steel bottle";
		this.cost=300;
		System.out.println("init block 2");
	}

	public static void  bottleInfo(WaterBottle bottle) {
		 System.out.println("Bottle Information ");
		 System.out.println("\tId :"+bottle.id);
		 System.out.println("\tType :"+bottle.type);
		 System.out.println("\tcost :"+bottle.cost);
	}

	public static void main(String[] args) {
		WaterBottle bottle = new WaterBottle();
        
		WaterBottle.bottleInfo(bottle);
		
	}

}
