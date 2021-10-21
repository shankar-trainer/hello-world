
public class Example4 {

	int width;
	int length;
	
	
	
	public static void main(String[] args) {
	
		Example4 example4=new Example4();
		example4.width=100;
		example4.length=200;
		
		Example4 example5=example4;
		
		System.out.println(example5.width);
		System.out.println(example5.length);
		
		example4.width=700;
		
		System.out.println(example5.width);
		
		example5.width=900;
       
		System.out.println(example4.width);
		
		
		
		
		
		
		
	}
}
