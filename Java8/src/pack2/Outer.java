package pack2;

public class Outer {
	int a, b;

	public Outer(int a, int b) {
		this.a = a;
		this.b = b;
	}

	class inner1 {
		int res;

		void addition(Outer o) {
			res = o.a + o.b;
			System.out.println("Sum is " + res);
		}
	}

	private class inner2 {
		int res;

		void subtraction() {
			res = a - b;
			System.out.println("Subtraction  is " + res);
		}
	}

	protected class inner3 {

	}

	public class inner4 {

	}

	public static void main(String[] args) {

		//inner1 in1=new inner1();
		
		Outer outer=new Outer(11, 2);
		
		   inner1 inner1 = outer.new inner1();
		   inner1.addition(outer);
		
		   outer.new inner2().subtraction();
		   
	}

}
