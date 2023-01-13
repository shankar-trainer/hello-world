public class Book {
   private int isbn;
   private String bname;
   private String author;
   private float cost;
   private float rebate;
   private static String country;

   static {
	   country="india";
   }   
   
   public static void setCountry(String country) {
	   Book.country = country;
   }
   public Book(int isbn, String bname, String author, float cost, float rebate) {
	this.isbn = isbn;
	this.bname = bname;
	this.author = author;
	this.cost = cost;
	this.rebate = rebate;
}


public static void bookInfo(Book b) { // static method can access static members directly
	   System.out.println("Book Information");
	   System.out.println("\tisbn "+b.isbn);
	   System.out.println("\tname "+b.bname);
	   System.out.println("\tauthor "+b.author);
	   System.out.println("\tcost "+b.cost);
	   System.out.println("\trebate "+b.rebate);
	   System.out.println("\tafter discount final cost is "+(b.cost-(b.cost*b.rebate/100)));
	   System.out.println("\tcountry "+country);
   }
   
   
   
}
