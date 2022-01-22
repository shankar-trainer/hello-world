
public class Book {

	private int isbn;
	private String bname;
	private static String compName = "apress";
	static int count=0;

	public Book(int isbn, String bname) {
		this.isbn = isbn;
		this.bname = bname;
		count++;
	}

	static void bookInfo(Book b) {
		System.out.println("\nBook information ");
		System.out.println("isbn " + b.isbn);
		System.out.println("name " + b.bname);
		System.out.println("book company name " + compName);
	}
	public static void main(String[] args) {
		Book book1 = new Book(676767, "java beginner");
		Book book2 = new Book(676768, "java expert");
		Book book3 = new Book(676761, "java professional");
		bookInfo(book1);
		bookInfo(book2);
		bookInfo(book3);
		
		System.out.println(book1.count);
		System.out.println(book2.count);
		System.out.println(book3.count);
	}

}
