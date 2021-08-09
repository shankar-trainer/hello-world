
public class BooMain {

	public static void main(String[] args) {
		Book book[] = new Book[3];

		int isbn[] = { 10001, 10002, 9004, 9005 };
		String bname[] = { "java beginner", "java in action", "java for dummies", "java black book" };
		String author[] = { "a kumar", "pankaj kumar", "arvind kumar", "mahesh kumar" };
		float price[] = { 700.00f, 1100.56f, 600.78f, 890.89f };
		float tot = 0;
		for (int i = 0; i < book.length; i++) {
			book[i] = new Book();
			book[i].setIsbn(isbn[i]);
			book[i].setBname(bname[i]);
			book[i].setCost(price[i]);
			book[i].setAuthor(author[i]);
			tot = tot + book[i].getCost();
		}

		System.out.println("Book Information ");

		for (Book book1 : book) {
			System.out.println(
					book1.getIsbn() + "  " + book1.getBname() + "  " + book1.getAuthor() + "  " + book1.getCost());
		}
		
		System.out.println("total cost is "+tot);
	}
}
