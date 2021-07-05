
public class StringEx2 {

	public static void main(String[] args) {
		
		String s1="welcome"; //  string pool  --- object1
		String s2="welcome"; //  string pool  --- object1
	String s3=new String("welcome"); // java heap -- object3
	
	    // ==    checks equality of  reference variable 
	    //.equals -- checks content of the reference variable
	
	System.out.println("cheking reference using ==");
	System.out.println(s1==s2);
	System.out.println(s1==s3);
	
	System.out.println("check content using .equals");
	
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	
	}
}
