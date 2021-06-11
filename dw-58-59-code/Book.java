public abstract class Book {

	private int isbn;
	private String bname;
	private String author;
	private float cost;
	private float rebate;

	int getIsbn() {
		return isbn;
	}

	String getBname() {
		return bname;
	}

	String getAuthor() {
		return author;
	}

	float getCost() {
		return cost;
	}

	float getRebate() {
		return rebate;
	}

	public Book(int isbn, String bname, String author, float cost, float rebate) {
		super();
		this.isbn = isbn;
		this.bname = bname;
		this.author = author;
		this.cost = cost;
		this.rebate = rebate;
	}


	abstract void bookInfo();

	float bookPrice() {
		return cost - (cost * rebate);
	}
}

class LiteratureBook extends Book {

	String location;

	public LiteratureBook(int isbn, String bname, String author, float cost, float rebate, String location) {
		super(isbn, bname, author, cost, rebate);
		this.location = location;
	}

	@Override
	void bookInfo() {
		System.out.println("Book Information ");
		System.out.println("isbn " + getIsbn());
		System.out.println("author " + getAuthor());
		System.out.println("book name " + getBname());
		System.out.println("cost " + getCost());
		System.out.println("rebate " + getRebate());
		System.out.println("price " + bookPrice());
		System.out.println("location " + location);
	}

	public static void main(String[] args) {
		Book book = new LiteratureBook(656565, "brave stories", "s kumar", 1200, 5, "chennai");
		book.bookInfo();
	}
}