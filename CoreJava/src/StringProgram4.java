
public class StringProgram4 {

	public static void main(String[] args) {
		
		String email="cts_ram@cognizant.com";
		
		System.out.println(email.startsWith("cts"));
		System.out.println(email.endsWith(".com"));
		
		int pos=email.indexOf("@");
		
		if(pos>=0)
			System.out.println("valid email");
		else
			System.out.println("invalid email");
		
		String var="we are learning  java. in it field java has very high scope";
		
		System.out.println(var.indexOf("java"));
		System.out.println(var.lastIndexOf("java"));
		
	//    String name="";
	    String name="harendra kumar";
	    
	    if(name.isEmpty())
	    	System.out.println("name is empty");
	    else
	    	System.out.println("name is "+name);
	
	    String country="  india  ";
        System.out.println(country.length());
        System.out.println(country.trim().length());
	}
}
