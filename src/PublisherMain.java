import java.util.Scanner;

public class PublisherMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter publisher id ");
		int id = sc.nextInt();

		System.out.println("enter publisher name ");
		String name = sc.next();

		System.out.println("Enter no of books");
		int n = sc.nextInt();

		String bname[] = new String[n];
		float bcost[] = new float[n];

		for (int i = 0; i < bcost.length; i++) {
			System.out.println("Enter book name and cost");
			bname[i] = sc.next();
			bcost[i] = sc.nextFloat();
		}

		Publisher publisher = new Publisher(id, name, bname, bcost);

		System.out.println("book publisher  information ");
		System.out.println("\tid "+publisher.getPublisherId());
		System.out.println("\tname "+publisher.getPublisherName());
		System.out.println("\n\tbooks  ");
		for(String b:publisher.getBooks()) {
			System.out.println("\t\t"+b);
		}
		System.out.println("\n\tcost  ");
		for(float f:publisher.getBookCost()) {
			System.out.println("\t\t"+f);
		}
	}
}
