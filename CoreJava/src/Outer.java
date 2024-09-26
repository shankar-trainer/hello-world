
public class Outer {
	private String name;
	private float salary;
	private float pf, hra;

	public Outer(String name, float salary, float pf, float hra) {
		this.name = name;
		this.salary = salary;
		this.pf = pf;
		this.hra = hra;
	}

	public String getName() {
		return name;
	}

	public float getSalary() {
		return salary;
	}

	public float getPf() {
		return pf;
	}

	public float getHra() {
		return hra;
	}

	private class Inner {
		
		float grossSalary() {
			return getSalary() - (getSalary() * pf + getSalary() * hra);
		}
	}

	public static void main(String[] args) {
		Outer outer = new Outer("madan kumar", 50000, 0.05f, 0.04f);
		Inner inner = outer.new Inner();

		System.out.println("User Information");
		System.out.println("name is " + outer.getName());
		System.out.println("salary  is " + outer.getSalary());
		System.out.println("PF  is " + outer.getPf()+"% PF Amount  is "+(outer.getSalary()*outer.getPf()));
		System.out.println("HRA is " + outer.getHra()+"% HRA Amount  is "+(outer.getSalary()*outer.getHra()));
		System.out.println("gross salary is " + inner.grossSalary());
	}
}
