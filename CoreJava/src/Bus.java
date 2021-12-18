
public class Bus {

	private int busRegNo;
	private String busType;
	private float busFare;
	
	{
		System.out.println("init block called");
		busRegNo=877887;
		busFare=789;
		busType="passenger bus";
	}
	
	public Bus() {
		busRegNo=654455;
		busFare=200;
		busType="tourist bus";
	  System.out.println("constructor called");
	}
	
	static {
		System.out.println("static block called");
	}
	
	public static void main(String[] args) {
		Bus bus1=new Bus();
		
		System.out.println(bus1.busRegNo);
		System.out.println(bus1.busType);
		System.out.println(bus1.busFare);
	}
}
