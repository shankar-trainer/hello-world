
public class Book {

	private int isbn;
	private String name;
	private String btype;
	private float price;
	private float discount;

	public Book(int isbn, String name, String btype, float price) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.btype = btype;
		this.price = price;

		if (btype.equals("kids"))
			this.discount = 0.3f;

		else if (btype.equals("literature"))
			this.discount = 0.2f;

		else if (btype.equals("computer"))
			this.discount = 0.1f;

	}

	public float getFinalPrice() {
		return price - price * discount;
	}

	public int getIsbn() {
		return isbn;
	}

	public String getName() {
		return name;
	}

	public String getBtype() {
		return btype;
	}

	public float getPrice() {
		return price;
	}

	public float getDiscount() {
		return discount;
	}

}
