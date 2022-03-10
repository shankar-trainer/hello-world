
public class Fruits {

	private int id;
	private String  name;
	private float cost;
	
	public Fruits(int id, String name, float cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "Fruid Information"+
	       "\n\tId is "+id+
	       "\n\tName is "+name+
	       "\n\tcost is "+cost
				;
	}

	public static void main(String[] args) {
    Fruits fruits=new Fruits(10001,"gradpes",300);
    
//    System.out.println(fruits.toString());
    System.out.println(fruits);
    
	}
}
