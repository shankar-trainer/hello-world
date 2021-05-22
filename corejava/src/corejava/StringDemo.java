package corejava;

public class StringDemo {

	public static void main(String[] args) {
		
		
		String s="hello"; // --- obj1
		
		s=s.concat(" world");//--- obj2
		
		System.out.println(s);
		
		String var1="welcome";// string pool  -- obj1
		String var2="welcome"; //string pool  -- obj1
		
		String var3=new String("welcome"); // -- obj2
		
		if(var1==var2)
			System.out.println("var1==var2");
		
		if(var1.equals(var2))
			System.out.println("var1.equals(var2)");
		
		if(var1==var3)
			System.out.println("var1==var3 will not work");
		
		if(var1.equals(var3))
			System.out.println("var1.equals(var3) work");
		
		
		
		
	}
	
}
