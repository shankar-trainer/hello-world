
public class StringExample7 {

	public static void main(String[] args) {
		
		
		String name="";
		
	//	if(name.isEmpty())
			if(name.isBlank())
			System.out.println("name is empty");
		else
			System.out.println("welcome "+name);
		
		String name1="  ";
		
		if(name1.isBlank())
			System.out.println("name is BLANK");
		else
			System.out.println("welcome "+name1);
		
		
		String city[]= {"delhi","mumbai","chennai","kolkotta","banglore","hyderabad"};
		 
		String mycitylist=String.join("-", city);
				
		System.out.println(mycitylist);
	}
}
