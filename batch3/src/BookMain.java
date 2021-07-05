class Book {
	private int isbn;
	private String book_name;
	private String book_author;
	private float book_cost;

	public Book(int isbn, String book_name, String book_author, float book_cost) {
		super();
		this.isbn = isbn;
		this.book_name = book_name;
		this.book_author = book_author;
		this.book_cost = book_cost;
	}
	

	@Override
	public String toString() {
		return  "Book Information "+
	    "\nIsbn "+isbn+
	    " \nname "+book_name+
		" \nauthor "+book_author+"\nBook cost"+book_cost;
	}

	float BookCost() {
		return book_cost;
	}
}

class MyBook extends Book {
	private float discount;
	private String bookType;

	public MyBook(int isbn, String book_name, String book_author, float book_cost, String bookType) {
		super(isbn, book_name, book_author, book_cost);
		this.bookType = bookType;
	}

	@Override
	//private  --not  
	//protected   --ok
	//public  ok 
	float BookCost() {
		
		if (bookType.equals("literature"))
			discount = 10.0f / 100;
		else if (bookType.equals("story"))
			discount = 15.0f / 100;
		else if (bookType.equals("science"))
			discount = 5.0f / 100;
	   return  BookCost()-BookCost()*discount;
	}

	@Override
	public String toString() {
		return super.toString() + " \n discount " + discount + "\nbookType  " + bookType;
	}

}

public class BookMain {

	public static void main(String[] args) {
		MyBook book=new MyBook(76667, "kids story","k kumar",600,"story" );
		System.out.println(book);
		System.out.println("final cost of book after discount "+book.BookCost());
	}
}
