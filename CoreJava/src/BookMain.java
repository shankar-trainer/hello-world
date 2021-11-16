
public class BookMain {

	public static void main(String[] args) {
		Book b1 = new Book(677678, "java in action", "a kumar", 4567.00f);
		Book b2 = new Book(677679, "sql in action", "p kumar", 4500.00f);

	
		Book.bookInfo1(b1);
		Book.bookInfo1(b2);
		                   //classname.variable name
		System.out.println(Math.PI);
		System.out.println(Math.tan(Math.PI/4));
		
		//System is a class
		// out is a static member of System class
		//out is object of PrintStream class in System class
		//PrintStream has println method 
		
		
		
		
	}
}
