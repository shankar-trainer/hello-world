
public class Book {

	private int isbn;
	private String bname;
	private float cost;
	private String author;

	public Book(int isbn, String bname, float cost, String author) {
		this(bname,author);
		this.isbn = isbn;
		this.cost = cost;
	}
	
	public Book(String bname, String author) {
		super();
		this.bname = bname;
		this.author=author;
	}

	public int getIsbn() {
		return isbn;
	}

	public String getBname() {
		return bname;
	}

	public float getCost() {
		return cost;
	}

	public String getAuthor() {
		return author;
	}

	
	
	
}
