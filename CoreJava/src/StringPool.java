
public class StringPool {

	public static void main(String[] args) {
		String var1="welcome";
		String var2="welcome";
		String var3="welcome";
		String var4="welcome";
          // above 4 reference variable , refers single object		
		// all above String have same string literal --- are kept in string pool 
		// all refers the same object 
		String var5=new String("welcome");// var5 will create new object outside string pool 
		
		// now total 5 reference variable and two objects 
		
		//==  for checking references, .equals  -- check content 
		
		System.out.println(var1==var2);
		System.out.println(var2==var3);
		System.out.println(var3==var4);
		System.out.println(var1==var4);
		
		System.out.println(var1==var5);
		
		System.out.println(var1.equals(var5));
		
		
		
		
		
		
	}
}
