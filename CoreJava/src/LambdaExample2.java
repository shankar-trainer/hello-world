public class LambdaExample2 {

	interface Addition{
		int sum(int a, int b);
	}
	
	public static void main(String[] args) {
		Addition addition=(x,y)-> x+y;
		
		System.out.println(addition.sum(11, 22));
	}
}
