
public class StringTest3 {

	public static void main(String[] args) {
		
		String s1="cat";  // string pool
		String s2="cat";  // string pool  s1,s2 will refer the same object 
		
		String s3=new String("cat"); // -- s3 object in heap , create new object 
				
		
		if(s1==s2)// == checks reference
			System.out.println("s1==s2");
		if(s1==s3)
			 System.out.println("s1==s3");
		
		
		if(s1.equals(s3))// -- checks the content 
			System.out.println("s1.equals(s3)");
		
		if(s1.equals(s2))
			System.out.println("s1.equals(s2)");
		
		
		String country="india";
		if(country==new String("india"))
			System.out.println("  ok ");
		
		if(country.equals(new String("india")))
			System.out.println("  ok ");
		
		
		if(country.contentEquals(new String("india")))
			System.out.println("  ok .. ");
		
		
	}
}
