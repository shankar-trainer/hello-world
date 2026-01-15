
public class Book {

	int isbn;
	String name;
	
	public  Book() {
	 System.out.println("default constructor called ");
	 this.isbn=878897;
	 this.name="java in action";
	}
	
	void bookInfo() {
		System.out.println("\nbook data  ");
		System.out.println("\t isbn "+isbn);
		System.out.println("\t name "+name);
	}
	
	public static void main(String[] args) {
		Book book=new Book();
		Book book1=new Book();
		Book book2=new Book();
		
		book1.isbn=98988;
		book1.name="java for dummies";

		book.bookInfo();
		book1.bookInfo();
		book2.bookInfo();
		
	}
	
}
