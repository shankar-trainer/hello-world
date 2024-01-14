
public class WrapperClass1 {

	public static void main(String[] args) {
		
		String s1="566556.5656";
		
		float salary = Float.parseFloat(s1);
		System.out.println(salary);
		System.out.println(salary+7878.445f);
		
		//parseXXX  -- static method
	    // it parses string and returns primitive 
		int age = Integer.parseInt("44");
		age+=10;
		
		String age1 = Integer.toString(age);
		System.out.println(age1);
		
		Float valueOf = Float.valueOf(12);
	
		//valueOf  -- static method
	    // it parses string and returns Wrapper 
	
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE);
		
		
	}
}
