
public class Publisher {

	private int publisherId;
	private String publisherName;
	private String books[];
	private float bookCost[];

	public Publisher(int publisherId, String publisherName, String[] books, float[] bookCost) {
		super();
		this.publisherId = publisherId;
		this.publisherName = publisherName;
		this.books = books;
		this.bookCost = bookCost;
	}

	public int getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String[] getBooks() {
		return books;
	}

	public void setBooks(String[] books) {
		this.books = books;
	}

	public float[] getBookCost() {
		return bookCost;
	}

	public void setBookCost(float[] bookCost) {
		this.bookCost = bookCost;
	}

}
