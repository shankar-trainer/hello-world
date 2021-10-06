public class Book {
	private int isbn;
	private String book_name;
	private float cost;
	private String author;

	public Book(int isbn, String book_name, float cost, String author) {
		this.isbn = isbn;
		this.book_name = book_name;
		this.cost = cost;
		this.author = author;
	}
	
	public void  bookInfo(){
		System.out.println("\nBook Information");
		System.out.println("isbn is "+isbn);
		System.out.println("isbn is "+book_name);
		System.out.println("isbn is "+cost);
		System.out.println("isbn is "+author);
	}
}
