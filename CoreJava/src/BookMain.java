
public class BookMain {

	public static void main(String[] args) {

		Book book[] = new Book[4];

		int isbn[] = { 9002222, 9002221, 9002227, 9002242 };
		String bname[] = { "java in action", "kids story", "revolution 2020", "java beginner" };
		float cost[] = { 2000, 400, 800, 1200 };

		String bookType[] = { "computer", "kids", "literature", "computer" };

		for (int i = 0; i < bookType.length; i++) {
			book[i] = new Book(isbn[i], bname[i], bookType[i], cost[i]);
		}

		System.out.println("Book Records are ");
		for (Book b : book) {
			System.out.println("----------------------\n");
			System.out.println("isbn " + b.getIsbn());
			System.out.println("name " + b.getName());
			System.out.println("type " + b.getBtype());
			System.out.println("cost " + b.getPrice());
			System.out.println("discount " + b.getDiscount());
			System.out.println("final cost " + b.getFinalPrice());
			System.out.println("\n----------------------");
		}

	}
}
