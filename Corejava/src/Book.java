
public class Book {
	long isbn; // instance variable
	String book_name;
	String author;
	float cost;
	float discount;
	String type;

	public Book(long isbn, String book_name, String author, float cost,  String type) {
		this.isbn = isbn;
		this.book_name = book_name;
		this.author = author;
		this.cost = cost;
		this.type=type;
	}

	void bookInfo() {
		System.out.println();
		System.out.println("Book1 Information");
		System.out.println("\tisbn " + isbn);
		System.out.println("\tname " + book_name);
		System.out.println("\tauthor " + author);
		System.out.println("\tcost " + cost);
		System.out.println("\ttype " + type);
		if(type=="computer")
			discount=40/100.0f;
		
		if(type=="literature")
			discount=30/100.0f;
		
		if(type=="kids")
			discount=20/100.0f;
		
		if(type=="law")
			discount=10/100.0f;
		
			System.out.println("\tdiscount " + discount);
			System.out.println("\tafter discount final price " + (cost-cost*discount));
			
	}

	public static void main(String[] args) {
		Book book1 = new Book(23232, "java beginner", "suresh prasad", 500,"computer");
		Book book2 = new Book(23233, "java advanced", "umesh kumar", 600.56f,"computer");
		Book book3 = new Book(23234, "java for dummies", "lalan prasad", 700.90f,"computer");

		book1.bookInfo();
		book2.bookInfo();
		book3.bookInfo();
//    System.out.println("Book1 Information");
//    System.out.println("\tisbn "+book1.isbn);
//    System.out.println("\tname "+book1.book_name);
//    System.out.println("\tauthor "+book1.author);
//    System.out.println("\tcost "+book1.cost);

	}
}
