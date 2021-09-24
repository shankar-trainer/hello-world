package pack2;

import java.util.Objects;

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
/*
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Director) {
			 Director director=(Director) obj;
			 if(director.id== this.id && director.name.equals(this.name) && director.salary==this.salary) {
				 return true;
			 }
		}
		return false;
	}
*/

	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Director other = (Director) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Float.floatToIntBits(salary) == Float.floatToIntBits(other.salary);
	}
	
	public static void main(String[] args) {
		
		Director director1=new Director(88787,"lalan kumar",300000);
		Director director2=new Director(88787,"lalan kumar",300000);
		
		System.out.println(director1);
		System.out.println(director2);
		
		System.out.println(director1.equals(director2));
		
		
		
	}

	
	
}
