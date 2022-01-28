interface Calculation{
	int addition(int a, int b);
	int subtraction(int a, int b);
}

public class AnonymousInnerExample {
	
	public static void main(String[] args) {
		Calculation calculation=new Calculation() {
			@Override
			public int subtraction(int a, int b) {
				return a-b;
			}
			
			@Override
			public int addition(int a, int b) {
				return a+b;
			}
		};
		System.out.println("Addition "+calculation.addition(11, 22));
		System.out.println("Subtraction "+calculation.subtraction(12, 2));
	}
	
}
