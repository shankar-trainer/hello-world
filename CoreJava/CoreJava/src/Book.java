
public class Book {

	private int isbn; // instance variable
	private String bname;
	private String author;
	private float cost;

	private static String publication; // class(static variable)

	// static block initializes static(class) variable
	static {
		System.out.println("static block called 1 ");
		publication = "manning";
	}
	
	static {
		System.out.println("static block called 2 ");
	}
	static {
		System.out.println("static block called 3 ");
	}

	//instance or non static method, here static,instance both used directly 
	public void bookInfo() {
		System.out.println(isbn);
		System.out.println(bname);
		System.out.println(author);
		System.out.println(cost);
		System.out.println(Book.publication);
	}
	
	//class or static method, inside method static members are used directly
	public static void  bookInfo1(Book b) {
		System.out.println("\nisbn "+b.isbn);
		System.out.println("book name "+b.bname);
		System.out.println("author "+b.author);
		System.out.println("cost "+b.cost);
		System.out.println("publication "+Book.publication);
	}
	
	
	// constructor initializes instance variable
	public Book(int isbn, String bname, String author, float cost) {
		System.out.println("constructor called ");
		this.isbn = isbn;
		this.bname = bname;
		this.author = author;
		this.cost = cost;
	}

	public static void main(String[] args) {
      Book b1=new Book(677678,"java in action","a kumar",4567.00f);
      Book b2=new Book(677679,"sql in action","p kumar",4500.00f);
      
      System.out.println("book publication is "+Book.publication);
      System.out.println("book1 isbn is "+b1.isbn);
      System.out.println("book1 name is "+b1.bname);
      System.out.println("book1 cost is "+b1.cost);
      System.out.println("book1 author is "+b1.author);
	}

}
