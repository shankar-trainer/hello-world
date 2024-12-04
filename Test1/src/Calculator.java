@FunctionalInterface
interface calculate{
	int add(int a, int b);
}

public class Calculator {

	calculate calculate=new calculate() {
		
		@Override
		public int add(int a, int b) {
			return a+b;
		}
	};
	
	
	calculate calculate2=(x,y)->x+y;
			
	
}
