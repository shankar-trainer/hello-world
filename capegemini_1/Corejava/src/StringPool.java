
public class StringPool {

	
	public static void main(String[] args) {
		String var1="abc";
		String var2="abc";
		   // 2 reference 1 object(1st) -- string pool
		
		String var3=new String("abc");
		    // create a new object outside string pool
	        // 3 reference variable 2 object	  
	// == checks references 
		
		if(var1==var2)
			System.out.println("var1==var2");
		
		if(var1==var3)
			System.out.println("var1==var3 will not work");
		
		if(var1.equals(var2))
			System.out.println("var1.equals(var2)");
		
		if(var1.equals(var3))
			System.out.println("var1.equals(var3) will work");
		
		
		System.out.println("abc"=="abc");
		System.out.println("abc"==new String("abc"));
		System.out.println("abc".equals(new String("abc")));
		
		
	}
}
