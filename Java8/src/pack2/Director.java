package pack2;

public class Director {

	private int id;
	private String name;
	private float salary;
	
	public Director(int id, String name, float salary) {		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	
	@Override
	public String toString() {
		return "Director [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}



	public static void main(String[] args) {
		
		Director director=new Director(88787,"lalan kumar",300000);
//		System.out.println(director.toString());
		System.out.println(director);
		
	}
	
}
